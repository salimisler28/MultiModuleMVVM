package com.example.data.di

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Singleton
    @Provides
    fun provideRetrofit(
            okHttpClient: OkHttpClient,
            gsonConverterFactory: GsonConverterFactory,
            coroutineCallAdapterFactory: CoroutineCallAdapterFactory
    ) = Retrofit.Builder()
            .baseUrl("")
            .addCallAdapterFactory(coroutineCallAdapterFactory)
            .addConverterFactory(gsonConverterFactory)
            .client(okHttpClient)
            .build()

    @Singleton
    @Provides
    fun provideOkHttp() = OkHttpClient.Builder()
            .readTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .build()

    @Singleton
    @Provides
    fun provideGsonConverterFactory() = GsonConverterFactory.create()

    @Singleton
    @Provides
    fun provideCallAdapter() = CoroutineCallAdapterFactory.invoke()
}