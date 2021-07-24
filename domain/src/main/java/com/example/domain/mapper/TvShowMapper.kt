package com.example.domain.mapper

import com.example.data.network.dto.TvShowDto
import com.example.domain.IMapper
import com.example.domain.model.TvShow
import javax.inject.Inject

class TvShowMapper @Inject constructor() : IMapper<TvShowDto, TvShow> {
    override fun mapDtoToModel(dto: TvShowDto?): TvShow {
        return TvShow(
            backdrop_path = dto?.backdrop_path,
            first_air_date = dto?.first_air_date,
            genre_ids = dto?.genre_ids,
            id = dto?.id,
            name = dto?.name,
            origin_country = dto?.origin_country,
            original_language = dto?.original_language,
            original_name = dto?.original_name,
            overview = dto?.overview,
            popularity = dto?.popularity,
            poster_path = dto?.poster_path,
            vote_average = dto?.vote_average,
            vote_count = dto?.vote_count
        )
    }

    override fun mapListDtoToListModel(dto: List<TvShowDto>?): List<TvShow>? {
        return dto?.map { mapDtoToModel(it) }
    }
}