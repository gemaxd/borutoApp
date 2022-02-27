package com.example.borutoapp.feature_hero.domain.use_cases.get_all_heroes

import androidx.paging.PagingData
import com.example.borutoapp.feature_hero.data.repository.Repository
import com.example.borutoapp.feature_hero.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class GetAllHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(): Flow<PagingData<Hero>>{
        return repository.getAllHeroes()
    }
}