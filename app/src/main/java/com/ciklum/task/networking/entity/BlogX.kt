package com.ciklum.task.networking.entity


import com.google.gson.annotations.SerializedName

data class BlogX(
    @SerializedName("active")
    val active: Boolean,
    @SerializedName("can_be_followed")
    val canBeFollowed: Boolean,
    @SerializedName("name")
    val name: String,
    @SerializedName("share_following")
    val shareFollowing: Boolean,
    @SerializedName("share_likes")
    val shareLikes: Boolean,
    @SerializedName("theme")
    val theme: Theme
)