package com.example.jinkan.models


import com.google.gson.annotations.SerializedName

data class Top(
    @SerializedName("end_date")
    val endDate: Any,
    @SerializedName("episodes")
    val episodes: Any,
    @SerializedName("image_url")
    val imageUrl: String,
    @SerializedName("mal_id")
    val malId: Int,
    @SerializedName("members")
    val members: Int,
    @SerializedName("rank")
    val rank: Int,
    @SerializedName("score")
    val score: Int,
    @SerializedName("start_date")
    val startDate: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)