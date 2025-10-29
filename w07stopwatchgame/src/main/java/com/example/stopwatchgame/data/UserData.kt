package com.example.stopwatchgame.data

data class UserData(
    val userId: String,
    val userName: String,
    val totalScore: Int
)

val INITIAL_USER_DATA = UserData(
    userId = "player1",
    userName = "스톱워치 마스터",
    totalScore = 0
)