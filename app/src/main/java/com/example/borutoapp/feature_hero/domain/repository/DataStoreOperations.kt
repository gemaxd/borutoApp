package com.example.borutoapp.feature_hero.domain.repository

import kotlinx.coroutines.flow.Flow

interface DataStoreOperations {
    suspend fun saveOnBoardingState(completed: Boolean)
    fun readOnBoardingSate(): Flow<Boolean>
}