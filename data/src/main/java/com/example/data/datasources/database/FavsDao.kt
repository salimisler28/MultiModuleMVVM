package com.example.data.datasources.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.data.network.dto.TvShowDto
import kotlinx.coroutines.flow.Flow

/*
@Dao
interface FavsDao {
    @Query("SELECT * FROM `favs`")
    fun getAll(): Flow<List<TvShowDto>>

    @Insert
    suspend fun add(tvShowDto: TvShowDto)

    @Delete
    suspend fun delete(tvShowDto: TvShowDto)
}

 */