package com.example.data.network.response

import com.example.data.network.dto.*

data class TvShowDetailResponse(
    var backdrop_path: String? = null,
    var created_by: List<CreatorDto>? = null,
    var episode_run_time: List<Int>? = null,
    var first_air_date: String? = null,
    var genres: List<GenreDto>? = null,
    var homepage: String? = null,
    var id: Int? = null,
    var in_production: Boolean? = null,
    var languages: List<String>? = null,
    var last_air_date: String? = null,
    var last_episode_to_air: Any? = null,
    var name: String? = null,
    var next_episode_to_air: Any? = null,
    var networks: List<NetworkDto>? = null,
    var number_of_episodes: Int? = null,
    var number_of_seasons: Int? = null,
    var origin_country: List<String>? = null,
    var original_language: String? = null,
    var original_name: String? = null,
    var overview: String? = null,
    var popularity: Double? = null,
    var poster_path: String? = null,
    var production_companies: List<CompanyDto>? = null,
    var production_countries: List<CountryDto>? = null,
    var seasons: List<SeasonDto>? = null,
    var spoken_languages: List<LanguageDto>? = null,
    var status: String? = null,
    var tagline: String? = null,
    var type: String? = null,
    var vote_average: Double? = null,
    var vote_count: Int? = null,
)