package com.example.domain.mapper

import com.example.data.network.dto.SeasonDto
import com.example.domain.IMapper
import com.example.domain.model.Season
import javax.inject.Inject

class SeasonMapper @Inject constructor() : IMapper<SeasonDto, Season> {
    override fun mapDtoToModel(dto: SeasonDto?): Season {
        return Season()
    }

    override fun mapListDtoToListModel(dto: List<SeasonDto>?): List<Season>? {
        return dto?.map { mapDtoToModel(it) }
    }
}