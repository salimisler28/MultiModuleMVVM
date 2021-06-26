package com.example.domain.mapper

import com.example.data.network.dto.CompanyDto
import com.example.domain.Company
import com.example.domain.IMapper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class CompanyMapper @Inject constructor() : IMapper<CompanyDto, Company> {
    override fun mapDtoToModel(dto: CompanyDto): Company {
        return Company(
            logo_path = dto.logo_path,
            name = dto.name,
            origin_country = dto.origin_country
        )
    }

    override fun mapListDtoToListModel(dto: List<CompanyDto>): List<Company> {
        return dto.map { mapDtoToModel(it) }
    }
}