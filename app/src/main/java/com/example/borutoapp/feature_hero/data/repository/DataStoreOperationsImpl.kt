package com.example.borutoapp.feature_hero.data.repository

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.preferencesDataStore
import com.example.borutoapp.feature_hero.domain.repository.DataStoreOperations
import com.example.borutoapp.util.Constants.PREFERENCES_APP_NAME
import com.example.borutoapp.util.Constants.PREFERENCES_ON_BOARDING_KEY
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException

val Context.datastore: DataStore<Preferences> by preferencesDataStore(PREFERENCES_APP_NAME)

class DataStoreOperationsImpl(context: Context): DataStoreOperations {

    private object PreferenceKey {
        val onBoardingKey = booleanPreferencesKey(PREFERENCES_ON_BOARDING_KEY)
    }

    private val dataStore = context.datastore

    override suspend fun saveOnBoardingState(completed: Boolean) {
        dataStore.edit { preferences ->
            preferences[PreferenceKey.onBoardingKey] = completed
        }
    }

    override fun readOnBoardingSate(): Flow<Boolean> {
        return dataStore.data
            .catch { exception ->
                if(exception is IOException){
                    emit(emptyPreferences())
                }else{
                    throw exception
                }
            }
            .map { preferences ->
                val onBoardingState = preferences[PreferenceKey.onBoardingKey] ?: false
                onBoardingState
            }
    }
}