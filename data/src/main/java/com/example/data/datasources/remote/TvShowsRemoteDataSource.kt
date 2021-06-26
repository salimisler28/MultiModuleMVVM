package com.example.data.datasources.remote

import com.example.data.getResult
import com.example.data.network.request.GetPopularTvShowDetailRequest
import com.example.data.network.request.GetPopularTvShowsRequest
import com.example.data.network.service.TvShowsApi

class TvShowsRemoteDataSource(
    private val tvShowsApi: TvShowsApi
) {
    suspend fun getPopularTvShows(
        tvShowsRequest: GetPopularTvShowsRequest
    ) = getResult {
        tvShowsApi.getPopularTvShows(
            apiKey = tvShowsRequest.apiKey,
            language = tvShowsRequest.language,
            page = tvShowsRequest.page
        )
    }

    suspend fun getPopularTvShow(
        tvShowDetailRequest: GetPopularTvShowDetailRequest
    ) = getResult {
        tvShowsApi.getPopularTvShow(
            id = tvShowDetailRequest.id,
            apiKey = tvShowDetailRequest.apiKey,
            language = tvShowDetailRequest.language,
            page = tvShowDetailRequest.page
        )
    }
}