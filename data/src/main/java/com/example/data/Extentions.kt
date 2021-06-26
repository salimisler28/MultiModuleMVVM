package com.example.data

import com.example.common.Resource
import retrofit2.Response
import java.lang.Exception

suspend fun <T> getResult(
    networkRequest: (suspend () -> Response<T>)
): Resource<T> {
    return try {
        val call = networkRequest.invoke()

        if (call.isSuccessful) {
            Resource.success(data = call.body())
        } else {
            Resource.error(message = call.message())
        }
    } catch (e: Exception) {
        Resource.error(message = e.stackTrace.toString())
    }
}