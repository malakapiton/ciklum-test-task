package com.ciklum.task.networking.entity


import com.google.gson.annotations.SerializedName

data class Trail(
    @SerializedName("blog")
    val blog: BlogX,
    @SerializedName("content")
    val content: String,
    @SerializedName("content_raw")
    val contentRaw: String,
    @SerializedName("is_current_item")
    val isCurrentItem: Boolean,
    @SerializedName("is_root_item")
    val isRootItem: Boolean,
    @SerializedName("post")
    val post: Post
)