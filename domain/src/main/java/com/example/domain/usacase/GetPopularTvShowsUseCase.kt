package com.example.domain.usacase

import androidx.paging.PagingData
import com.example.common.Resource
import com.example.data.network.request.GetPopularTvShowsRequest
import com.example.data.repo.TvShowsRepo
import com.example.domain.mapper.TvShowMapper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GetPopularTvShowsUseCase @Inject constructor(
    private val tvShowsRepo: TvShowsRepo,
    private val tvShowMapper: TvShowMapper
) {
    suspend fun getPopularTvShows(
        tvShowsRequest: GetPopularTvShowsRequest
    ) = tvShowsRepo
        .getPopularTvShows(tvShowsRequest)
        .map { data ->
            return@map data.map {
                tvShowMapper.mapListDtoToListModel(data.data?.results)
            }
        }
        .flowOn(Dispatchers.IO)
}

fun <T, A> Resource<T>.map(func: (T?) -> A): Resource<A> {
    return when (this.status) {
        Resource.Status.LOADING -> {
            Resource.loading()
        }

        Resource.Status.ERROR -> {
            Resource.error(message = this.message)
        }

        Resource.Status.SUCCESS -> {
            Resource.success(data = func.invoke(this.data))
        }
    }
}