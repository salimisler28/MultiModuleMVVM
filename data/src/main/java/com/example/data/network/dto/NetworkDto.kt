package com.example.data.network.dto

import com.example.common.Dto

data class NetworkDto(
    var name: String? = null,
    var id: Int? = null,
    var logo_path: String? = null,
    var origin_country: String? = null,
): Dto