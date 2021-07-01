package com.example.jinkan.models


import com.google.gson.annotations.SerializedName

data class Risposte(
    @SerializedName("request_cache_expiry")
    val requestCacheExpiry: Int,
    @SerializedName("request_cached")
    val requestCached: Boolean,
    @SerializedName("request_hash")
    val requestHash: String,
    @SerializedName("top")
    val top: List<Top>
)