package com.ciklum.task.repository

import com.ciklum.task.networking.ApiService
import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkingRepository {

    suspend fun getTumblrImages(searchText: String) = service.getTumblrImages(searchText)

    companion object {
        private const val BASE_URL = "https://api.tumblr.com/v2/"

        private val loggingInterceptor =
            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

        private val client = OkHttpClient.Builder().addInterceptor(Interceptor {
            val original = it.request()
            val httpUrl = original.url
            val newHttpUrl = httpUrl.newBuilder()
                .addQueryParameter("api_key", "CcEqqSrYdQ5qTHFWssSMof4tPZ89sfx6AXYNQ4eoXHMgPJE03U")
                .build()
            val requestBuilder = original.newBuilder().url(newHttpUrl)
            val request = requestBuilder.build()

            return@Interceptor it.proceed(request)
        }).addInterceptor(loggingInterceptor).build()

        val service: ApiService = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
            .create(ApiService::class.java)
    }
}