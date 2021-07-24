package com.example.data.network.dto

import com.example.common.Dto

data class LastEpisodeToAirDto(
    var air_date: String? = null,
    var episode_number: Int? = null,
    var id: Int? = null,
    var name: String? = null,
    var overview: String? = null,
    var production_code: String? = null,
    var season_number: Int? = null,
    var still_path: String? = null,
    var vote_average: Double? = null,
    var vote_count: Int? = null,
): Dto