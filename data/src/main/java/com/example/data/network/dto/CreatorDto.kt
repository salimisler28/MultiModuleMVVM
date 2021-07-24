package com.example.data.network.dto

import com.example.common.Dto

data class CreatorDto(
    var id: Int? = null,
    var credit_id: String? = null,
    var name: String? = null,
    var gender: Int? = null,
    var profile_path: String? = null,
): Dto