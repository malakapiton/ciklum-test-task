package com.ciklum.task.networking.entity


import com.google.gson.annotations.SerializedName

data class AltSize(
    @SerializedName("height")
    val height: Int,
    @SerializedName("url")
    val url: String,
    @SerializedName("width")
    val width: Int
)