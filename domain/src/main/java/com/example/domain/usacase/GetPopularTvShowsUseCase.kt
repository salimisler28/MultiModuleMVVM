package com.example.domain.usacase

import com.example.common.Resource
import com.example.data.datasources.remote.TvShowsRemoteDataSource
import com.example.data.network.dto.TvShowDto
import com.example.data.network.response.GetPopularTvShowsResponse
import com.example.data.network.service.TvShowsApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.onStart
import javax.inject.Inject

class GetPopularTvShowsUseCase @Inject constructor(
    private val remoteDataSource: TvShowsRemoteDataSource
) {
    fun getPopularTvShows() = flow<Resource<GetPopularTvShowsResponse>> {

    }.onStart {
        emit(Resource.loading())
    }.flowOn(Dispatchers.IO)
}