package com.example.domain.mapper

import com.example.data.network.dto.LastEpisodeToAirDto
import com.example.domain.IMapper
import com.example.domain.model.LastEpisodeToAir
import javax.inject.Inject

class LastEpisodeToAirMapper @Inject constructor() : IMapper<LastEpisodeToAirDto, LastEpisodeToAir> {
    override fun mapDtoToModel(dto: LastEpisodeToAirDto?): LastEpisodeToAir {
        return LastEpisodeToAir()
    }

    override fun mapListDtoToListModel(dto: List<LastEpisodeToAirDto>?): List<LastEpisodeToAir>? {
        return dto?.map { mapDtoToModel(it) }
    }
}