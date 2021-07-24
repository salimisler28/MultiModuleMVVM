package com.example.data.network.dto

import com.example.common.Dto

data class CountryDto(
    var iso_3166_1: String? = null,
    var name: String? = null
): Dto