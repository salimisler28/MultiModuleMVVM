package com.example.domain.mapper

import com.example.data.network.dto.LanguageDto
import com.example.domain.IMapper
import com.example.domain.model.Language
import javax.inject.Inject

class LanguageMapper @Inject constructor() : IMapper<LanguageDto, Language> {
    override fun mapDtoToModel(dto: LanguageDto?): Language {
        return Language(
            english_name = dto?.english_name,
            name = dto?.english_name
        )
    }

    override fun mapListDtoToListModel(dto: List<LanguageDto>?): List<Language>? {
        return dto?.map { mapDtoToModel(it) }
    }
}