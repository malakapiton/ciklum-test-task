package com.ciklum.task.networking.entity


import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("blog")
    val blog: Blog,
    @SerializedName("blog_name")
    val blogName: String,
    @SerializedName("body")
    val body: String,
    @SerializedName("can_like")
    val canLike: Boolean,
    @SerializedName("can_reblog")
    val canReblog: Boolean,
    @SerializedName("can_reply")
    val canReply: Boolean,
    @SerializedName("can_send_in_message")
    val canSendInMessage: Boolean,
    @SerializedName("caption")
    val caption: String,
    @SerializedName("date")
    val date: String,
    @SerializedName("display_avatar")
    val displayAvatar: Boolean,
    @SerializedName("format")
    val format: String,
    @SerializedName("id")
    val id: Long,
    @SerializedName("id_string")
    val idString: String,
    @SerializedName("image_permalink")
    val imagePermalink: String,
    @SerializedName("interactability_reblog")
    val interactabilityReblog: String,
    @SerializedName("note_count")
    val noteCount: Int,
    @SerializedName("photos")
    val photos: List<Photo>,
    @SerializedName("post_url")
    val postUrl: String,
    @SerializedName("reblog")
    val reblog: Reblog,
    @SerializedName("reblog_key")
    val reblogKey: String,
    @SerializedName("recommended_color")
    val recommendedColor: Any,
    @SerializedName("recommended_source")
    val recommendedSource: Any,
    @SerializedName("short_url")
    val shortUrl: String,
    @SerializedName("should_open_in_legacy")
    val shouldOpenInLegacy: Boolean,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("state")
    val state: String,
    @SerializedName("summary")
    val summary: String,
    @SerializedName("tags")
    val tags: List<String>,
    @SerializedName("timestamp")
    val timestamp: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("trail")
    val trail: List<Trail>,
    @SerializedName("type")
    val type: String
)