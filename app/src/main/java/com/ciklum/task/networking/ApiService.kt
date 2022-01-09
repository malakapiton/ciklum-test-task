package com.ciklum.task.networking

import com.ciklum.task.networking.entity.Response
import com.ciklum.task.networking.entity.TumblrResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("tagged")
    suspend fun getTumblrImages(
        @Query("tag") searchText: String
    ): TumblrResponse
}