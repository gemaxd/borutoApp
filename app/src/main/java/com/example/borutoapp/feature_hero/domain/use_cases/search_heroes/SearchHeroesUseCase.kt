package com.example.borutoapp.feature_hero.domain.use_cases.search_heroes

import androidx.paging.PagingData
import com.example.borutoapp.feature_hero.data.repository.Repository
import com.example.borutoapp.feature_hero.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class SearchHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(query: String): Flow<PagingData<Hero>>{
        return repository.searchHeroes(query = query)
    }
}