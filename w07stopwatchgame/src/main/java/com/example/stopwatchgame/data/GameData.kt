package com.example.stopwatchgame.data

data class GameData(
    val currentTimeMs: Long = 0L,
    val isRunning: Boolean = false,
    val currentPoint: Int = 0
)