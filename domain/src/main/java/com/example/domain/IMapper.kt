package com.example.domain

import com.example.common.Dto
import com.example.common.Model

interface IMapper<DTO : Dto, MODEL : Model> {
    fun mapDtoToModel(dto: DTO?): MODEL
    fun mapListDtoToListModel(dto: List<DTO>?): List<MODEL>?
}