package com.example.borutoapp.feature_hero.domain.repository

import com.example.borutoapp.feature_hero.domain.model.Hero

interface LocalDataSource {
    suspend fun getSelectedHero(heroId: Int): Hero
}