package com.example.domain.model

import com.example.common.Model

data class Creator(
    var id: Int? = null,
    var credit_id: String? = null,
    var name: String? = null,
    var gender: Int? = null,
    var profile_path: String? = null,
): Model