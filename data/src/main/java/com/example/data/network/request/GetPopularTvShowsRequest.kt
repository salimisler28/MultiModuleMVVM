package com.example.data.network.request

import java.util.*

data class GetPopularTvShowsRequest(
    var apiKey: String = "4842ed0eaf02963b0c0e15ceebf1ff5d",
    var language: String? = Locale.getDefault().toLanguageTag(),
    var page: Int? = null
)