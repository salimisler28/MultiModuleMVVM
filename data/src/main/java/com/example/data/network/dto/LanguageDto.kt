package com.example.data.network.dto

import com.example.common.Dto

data class LanguageDto(
    var english_name: String? = null,
    var iso_639_1: String? = null,
    var name: String? = null
): Dto
