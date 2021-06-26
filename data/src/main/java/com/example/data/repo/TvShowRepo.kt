package com.example.data.repo

import com.example.common.Resource
import com.example.data.network.request.GetPopularTvShowDetailRequest
import com.example.data.network.request.GetPopularTvShowsRequest
import com.example.data.network.response.GetPopularTvShowsResponse
import com.example.data.network.response.TvShowDetailResponse

interface TvShowRepo {
    suspend fun getPopularTvShows(
        tvShowsRequest: GetPopularTvShowsRequest
    ): Resource<GetPopularTvShowsResponse>

    suspend fun getPopularTvShow(
        tvShowDetailRequest: GetPopularTvShowDetailRequest
    ): Resource<TvShowDetailResponse>
}