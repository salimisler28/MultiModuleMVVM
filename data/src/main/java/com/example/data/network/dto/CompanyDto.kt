package com.example.data.network.dto

import com.example.common.Dto

data class CompanyDto(
    var id: Int? = null,
    var logo_path: String? = null,
    var name: String? = null,
    var origin_country: String? = null,
): Dto