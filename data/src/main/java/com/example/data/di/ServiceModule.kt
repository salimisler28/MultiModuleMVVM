package com.example.data.di

import com.example.data.network.service.TvShowsApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {
    @Singleton
    @Provides
    fun provideTvShowsApi(retrofit: Retrofit) = retrofit.create(TvShowsApi::class.java)
}