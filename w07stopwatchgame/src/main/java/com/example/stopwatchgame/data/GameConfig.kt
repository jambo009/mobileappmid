package com.example.stopwatchgame.data

data class GameConfig(
    val targetTimeMs: Long,
    val toleranceMs: Long
)

val DEFAULT_GAME_CONFIG = GameConfig(
    targetTimeMs = 3000L,
    toleranceMs = 200L
)