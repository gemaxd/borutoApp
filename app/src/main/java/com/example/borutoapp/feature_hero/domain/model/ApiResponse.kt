package com.example.borutoapp.feature_hero.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse(
    val success: Boolean,
    val message: String?,
    val prevPage: Int?,
    val nextPage: Int?,
    val heroes: List<Hero> = emptyList(),
    val lastUpdated: Long? = null
)
