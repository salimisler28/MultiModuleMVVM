package com.example.domain.mapper

import com.example.data.network.dto.NetworkDto
import com.example.domain.IMapper
import com.example.domain.model.Network
import javax.inject.Inject

class NetworkMapper @Inject constructor() : IMapper<NetworkDto, Network> {
    override fun mapDtoToModel(dto: NetworkDto?): Network {
        return Network(
            name = dto?.name,
            id = dto?.id,
            logo_path = dto?.logo_path,
            origin_country = dto?.origin_country
        )
    }

    override fun mapListDtoToListModel(dto: List<NetworkDto>?): List<Network>? {
        return dto?.map { mapDtoToModel(it) }
    }
}