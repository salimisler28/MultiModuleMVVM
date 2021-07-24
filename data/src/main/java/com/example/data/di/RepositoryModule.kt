package com.example.data.di

import com.example.data.datasources.remote.TvShowsRemoteDataSource
import com.example.data.repo.TvShowsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Singleton
    @Provides
    fun provideTvShowsRepo(
        tvShowsRemoteDataSource: TvShowsRemoteDataSource
    ) = TvShowsRepo(tvShowsRemoteDataSource)
}