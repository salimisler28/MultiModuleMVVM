package com.example.data.di

import com.example.data.datasources.remote.TvShowsRemoteDataSource
import com.example.data.network.service.TvShowsApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteDataSourceModule {
    @Singleton
    @Provides
    fun provideTvShowsRemoteDataSource(tvShowsApi: TvShowsApi) = TvShowsRemoteDataSource(tvShowsApi)
}