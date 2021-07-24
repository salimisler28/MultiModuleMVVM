package com.example.domain.mapper

import com.example.data.network.dto.CountryDto
import com.example.domain.model.Country
import com.example.domain.IMapper
import javax.inject.Inject

class CountryMapper @Inject constructor(): IMapper<CountryDto, Country> {
    override fun mapDtoToModel(dto: CountryDto?): Country {
        return Country(
            name = dto?.name
        )
    }

    override fun mapListDtoToListModel(dto: List<CountryDto>?): List<Country>? {
        return dto?.map { mapDtoToModel(it) }
    }
}