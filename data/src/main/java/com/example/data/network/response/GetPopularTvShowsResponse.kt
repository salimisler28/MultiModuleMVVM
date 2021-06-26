package com.example.data.network.response

import com.example.data.network.dto.TvShowDto

data class GetPopularTvShowsResponse(
    var page: Int? = null,
    var results: List<TvShowDto>? = null,
    var total_pages: Int? = null,
    var total_results: Int? = null
)