package com.ciklum.task.networking.entity


import com.google.gson.annotations.SerializedName

data class TumblrResponse(
    @SerializedName("meta")
    val meta: Meta,
    @SerializedName("response")
    val response: List<Response>
)