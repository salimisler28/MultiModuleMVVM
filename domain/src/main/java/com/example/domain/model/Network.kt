package com.example.domain.model

import com.example.common.Model

data class Network(
    var name: String? = null,
    var id: Int? = null,
    var logo_path: String? = null,
    var origin_country: String? = null,
) : Model