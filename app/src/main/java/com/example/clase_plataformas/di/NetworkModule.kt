package com.example.clase_plataformas.di

import com.example.clase_plataformas.data.remote.api.LibroApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    private const val LIBROS_BASE_URL = "https://q4hgqj7wca.execute-api.us-east-1.amazonaws.com/"

    @Provides
    @Singleton
    fun provideOkHttpClient() : OkHttpClient{
        return OkHttpClient.Builder().addInterceptor(HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }).build()
    }

    // Retrofit para Libros
    @Provides
    @Singleton
    @LibrosRetrofit
    fun provideLibrosRetrofit(okHttpClient: OkHttpClient): Retrofit{
        return Retrofit.Builder()
            .baseUrl(LIBROS_BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideLibroApiService(@LibrosRetrofit retrofit: Retrofit) : LibroApiService{
        return retrofit.create(LibroApiService::class.java)
    }

}