package com.example.domain.model

import com.example.common.Model

data class Season(
    var air_date: String? = null,
    var episode_count: Int? = null,
    var id: Int? = null,
    var name: String? = null,
    var overview: String? = null,
    var poster_path: String? = null,
    var season_number: Int? = null,
) : Model
