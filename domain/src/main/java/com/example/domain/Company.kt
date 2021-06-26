package com.example.domain

import com.example.common.Model

data class Company(
    var logo_path: String? = null,
    var name: String? = null,
    var origin_country: String? = null,
): Model
