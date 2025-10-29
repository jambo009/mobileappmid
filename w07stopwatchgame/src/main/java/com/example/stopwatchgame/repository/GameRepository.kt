package com.example.stopwatchgame.repository

import com.example.stopwatchgame.data.DEFAULT_GAME_CONFIG
import com.example.stopwatchgame.data.GameConfig
import com.example.stopwatchgame.data.INITIAL_USER_DATA
import com.example.stopwatchgame.data.UserData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class GameRepository {
    private val _config = MutableStateFlow(DEFAULT_GAME_CONFIG)
    val config: StateFlow<GameConfig> = _config.asStateFlow()

    fun updateConfig(newConfig: GameConfig) {
        _config.value = newConfig
    }

    private val _user = MutableStateFlow(INITIAL_USER_DATA)
    val user: StateFlow<UserData> = _user.asStateFlow()

    fun addPoint(point: Int = 1) {
        _user.update { currentUser ->
            currentUser.copy(totalScore = currentUser.totalScore + point)
        }
    }
}