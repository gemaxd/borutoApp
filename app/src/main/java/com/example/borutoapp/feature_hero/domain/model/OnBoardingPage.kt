package com.example.borutoapp.feature_hero.domain.model

import androidx.annotation.DrawableRes
import com.example.borutoapp.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
){
    object First: OnBoardingPage(
        image = R.drawable.greetings,
        title = "Greetings",
        description = "This is an Course app about Boruto characters, and this is a bit large description text about it"
    )

    object Second: OnBoardingPage(
        image = R.drawable.explore,
        title = "Explore",
        description = "This is an Course app about Boruto characters, and this is a bit large description text about it"
    )

    object Third: OnBoardingPage(
        image = R.drawable.power,
        title = "Power",
        description = "This is an Course app about Boruto characters, and this is a bit large description text about it"
    )
}
