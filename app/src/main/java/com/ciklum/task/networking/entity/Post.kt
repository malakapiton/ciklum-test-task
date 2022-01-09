package com.ciklum.task.networking.entity


import com.google.gson.annotations.SerializedName

data class Post(
    @SerializedName("id")
    val id: String
)