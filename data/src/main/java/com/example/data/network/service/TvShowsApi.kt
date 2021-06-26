package com.example.data.network.service

import com.example.data.network.response.GetPopularTvShowsResponse
import com.example.data.network.response.TvShowDetailResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TvShowsApi {
    @GET("tv/popular")
    suspend fun getPopularTvShows(
        @Query("api_key") apiKey: String,
        @Query("language") language: String? = null,
        @Query("page") page: Int? = null
    ): Response<GetPopularTvShowsResponse>

    @GET("tv/{tv_id}")
    suspend fun getPopularTvShow(
        @Path("tv_id") id: Int,
        @Query("api_key") apiKey: String,
        @Query("language") language: String? = null,
        @Query("page") page: Int? = null
    ): Response<TvShowDetailResponse>
}