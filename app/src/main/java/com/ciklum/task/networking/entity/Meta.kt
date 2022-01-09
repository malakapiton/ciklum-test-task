package com.ciklum.task.networking.entity


import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("msg")
    val msg: String,
    @SerializedName("status")
    val status: Int
)