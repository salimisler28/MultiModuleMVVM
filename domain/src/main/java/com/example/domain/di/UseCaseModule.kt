package com.example.domain.di

import com.example.data.repo.TvShowsRepo
import com.example.domain.mapper.TvShowMapper
import com.example.domain.usacase.GetPopularTvShowsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Singleton
    @Provides
    fun provideGetPopularTvShowsUseCase(
        tvShowsRepo: TvShowsRepo,
        tvShowMapper: TvShowMapper
    ) = GetPopularTvShowsUseCase(tvShowsRepo, tvShowMapper)
}