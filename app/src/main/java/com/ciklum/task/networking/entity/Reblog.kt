package com.ciklum.task.networking.entity


import com.google.gson.annotations.SerializedName

data class Reblog(
    @SerializedName("comment")
    val comment: String,
    @SerializedName("tree_html")
    val treeHtml: String
)