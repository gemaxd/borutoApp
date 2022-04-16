package com.example.borutoapp.feature_hero.domain.repository

import androidx.paging.PagingData
import com.example.borutoapp.feature_hero.domain.model.Hero
import kotlinx.coroutines.flow.Flow

interface RemoteDataSource {
    fun getAllHeroes(): Flow<PagingData<Hero>>
    fun searchHeroes(query: String): Flow<PagingData<Hero>>
}