package com.ciklum.task.networking.entity


import com.google.gson.annotations.SerializedName

data class Photo(
    @SerializedName("alt_sizes")
    val altSizes: List<AltSize>,
    @SerializedName("caption")
    val caption: String,
    @SerializedName("original_size")
    val originalSize: OriginalSize
)