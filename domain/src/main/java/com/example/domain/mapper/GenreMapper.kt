package com.example.domain.mapper

import com.example.data.network.dto.GenreDto
import com.example.domain.IMapper
import com.example.domain.model.Genre
import javax.inject.Inject

class GenreMapper @Inject constructor() : IMapper<GenreDto, Genre> {
    override fun mapDtoToModel(dto: GenreDto?): Genre {
        return Genre(
            id = dto?.id,
            name = dto?.name
        )
    }

    override fun mapListDtoToListModel(dto: List<GenreDto>?): List<Genre>? {
        return dto?.map { mapDtoToModel(it) }
    }
}