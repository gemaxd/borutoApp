package com.example.borutoapp.feature_hero.data.repository

import com.example.borutoapp.feature_hero.data.local.BorutoDatabase
import com.example.borutoapp.feature_hero.domain.model.Hero
import com.example.borutoapp.feature_hero.domain.repository.LocalDataSource

class LocalDataSourceImpl(borutoDatabase: BorutoDatabase) : LocalDataSource {


    private val heroDao = borutoDatabase.heroDao()

    override suspend fun getSelectedHero(heroId: Int): Hero {
        return heroDao.getSelectedHero(heroId = heroId)
    }

}