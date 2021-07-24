package com.example.data.repo

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.data.datasources.remote.TvShowsRemoteDataSource
import com.example.data.network.dto.TvShowDto
import com.example.data.network.request.GetPopularTvShowDetailRequest
import com.example.data.network.request.GetPopularTvShowsRequest
import com.example.data.util.fromNetwork
import kotlinx.coroutines.flow.Flow

class TvShowsRepo(
    private val tvShowsRemoteDataSource: TvShowsRemoteDataSource,
) {
    suspend fun getPopularTvShows(
        tvShowsRequest: GetPopularTvShowsRequest
    ) = fromNetwork {
        tvShowsRemoteDataSource.getPopularTvShows(tvShowsRequest)
    }

    suspend fun getPopularTvShow(
        tvShowDetailRequest: GetPopularTvShowDetailRequest
    ) = fromNetwork {
        tvShowsRemoteDataSource.getPopularTvShow(tvShowDetailRequest)
    }
}