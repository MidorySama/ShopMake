package com.patycorona.shopmark.models

import com.google.gson.annotations.SerializedName

class ApiHitModel (
    @SerializedName("objetID") val objetId: String= "",
    @SerializedName("title") val title: String = "",
    @SerializedName("author") val author: String = "",
    @SerializedName("story_url") val storyUrl: String = "",
    @SerializedName("url") val url: String = "",
    @SerializedName("story_title") val story_Title: String = "",
    @SerializedName("comment_text") val commentText: String = ""
)