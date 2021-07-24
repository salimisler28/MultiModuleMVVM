package com.example.domain.mapper

import com.example.data.network.dto.CreatorDto
import com.example.domain.IMapper
import com.example.domain.model.Creator
import javax.inject.Inject

class CreatorMapper @Inject constructor() : IMapper<CreatorDto, Creator> {
    override fun mapDtoToModel(dto: CreatorDto?): Creator {
        return Creator(
            id = dto?.id,
            credit_id = dto?.credit_id,
            name = dto?.name,
            gender = dto?.gender,
            profile_path = dto?.profile_path
        )
    }

    override fun mapListDtoToListModel(dto: List<CreatorDto>?): List<Creator>? {
        return dto?.map { mapDtoToModel(it) }
    }
}