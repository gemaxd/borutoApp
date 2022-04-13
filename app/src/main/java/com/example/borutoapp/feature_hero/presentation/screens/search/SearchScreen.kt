package com.example.borutoapp.feature_hero.presentation.screens.search

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable

@Composable
fun SearchScreen() {
    Scaffold(
        topBar = {
            SearchTopBar(
                text = "",
                onTextChange = {},
                onSearchClicked = {},
                onCloseClicked = {}
            )
        }
    ) {

    }
}