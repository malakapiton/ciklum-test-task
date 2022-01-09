package com.ciklum.task.networking.entity


import com.google.gson.annotations.SerializedName

data class Blog(
    @SerializedName("description")
    val description: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("updated")
    val updated: Int,
    @SerializedName("url")
    val url: String,
    @SerializedName("uuid")
    val uuid: String
)