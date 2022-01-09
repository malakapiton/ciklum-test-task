package com.ciklum.task.networking.entity


import com.google.gson.annotations.SerializedName

data class Theme(
    @SerializedName("avatar_shape")
    val avatarShape: String,
    @SerializedName("background_color")
    val backgroundColor: String,
    @SerializedName("body_font")
    val bodyFont: String,
    @SerializedName("header_bounds")
    val headerBounds: String,
    @SerializedName("header_focus_height")
    val headerFocusHeight: Int,
    @SerializedName("header_focus_width")
    val headerFocusWidth: Int,
    @SerializedName("header_full_height")
    val headerFullHeight: Int,
    @SerializedName("header_full_width")
    val headerFullWidth: Int,
    @SerializedName("header_image")
    val headerImage: String,
    @SerializedName("header_image_focused")
    val headerImageFocused: String,
    @SerializedName("header_image_poster")
    val headerImagePoster: String,
    @SerializedName("header_image_scaled")
    val headerImageScaled: String,
    @SerializedName("header_stretch")
    val headerStretch: Boolean,
    @SerializedName("link_color")
    val linkColor: String,
    @SerializedName("show_avatar")
    val showAvatar: Boolean,
    @SerializedName("show_description")
    val showDescription: Boolean,
    @SerializedName("show_header_image")
    val showHeaderImage: Boolean,
    @SerializedName("show_title")
    val showTitle: Boolean,
    @SerializedName("title_color")
    val titleColor: String,
    @SerializedName("title_font")
    val titleFont: String,
    @SerializedName("title_font_weight")
    val titleFontWeight: String
)