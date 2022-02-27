package com.example.borutoapp.feature_hero.domain.use_cases.read_onboarding

import com.example.borutoapp.feature_hero.data.repository.Repository
import kotlinx.coroutines.flow.Flow

class ReadOnBoardingUseCase(
    private val repository: Repository
) {

    operator fun invoke(): Flow<Boolean> {
        return repository.readOnBoardingState()
    }

}