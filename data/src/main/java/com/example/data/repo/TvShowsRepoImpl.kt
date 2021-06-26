package com.example.data.repo

import com.example.common.Resource
import com.example.data.datasources.remote.TvShowsRemoteDataSource
import com.example.data.network.request.GetPopularTvShowDetailRequest
import com.example.data.network.request.GetPopularTvShowsRequest
import com.example.data.network.response.GetPopularTvShowsResponse
import com.example.data.network.response.TvShowDetailResponse

class TvShowsRepoImpl(
    private val tvShowsRemoteDataSource: TvShowsRemoteDataSource
): TvShowRepo {
    override suspend fun getPopularTvShows(
        tvShowsRequest: GetPopularTvShowsRequest
    ): Resource<GetPopularTvShowsResponse> {
        return tvShowsRemoteDataSource.getPopularTvShows(tvShowsRequest)
    }

    override suspend fun getPopularTvShow(
        tvShowDetailRequest: GetPopularTvShowDetailRequest
    ): Resource<TvShowDetailResponse> {
        return tvShowsRemoteDataSource.getPopularTvShow(tvShowDetailRequest)
    }
}