package com.example.domain.util

import com.example.common.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*

fun <T> fromNetwork(
    request: suspend () -> Resource<T>
) = flow<Resource<T>> {
    val response = request.invoke()

    if (response.status == Resource.Status.SUCCESS) {
        emit(Resource.success(data = response.data))
    } else {
        emit(Resource.error(message = response.message))
    }
}.onStart {
    emit(Resource.loading())
}.flowOn(Dispatchers.IO)

fun <T> fromDatabase(
    query: () -> Flow<T>
) = flow<Resource<T>> {
    try {
        val result = query.invoke().map { Resource.success(data = it) }
        emitAll(result)
    } catch (e: Exception) {
        emit(Resource.error(message = e.message))
    }
}.onStart {
    emit(Resource.loading())
}.flowOn(Dispatchers.IO)