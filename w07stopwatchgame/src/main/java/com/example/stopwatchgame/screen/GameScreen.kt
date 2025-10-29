package com.example.stopwatchgame.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.stopwatchgame.ui.theme.StopwatchGameTheme
import java.util.concurrent.TimeUnit

@Composable
fun GameScreen(
    viewModel: GameViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "플레이어: ${uiState.currentUserData.userName} (총점: ${uiState.currentUserData.totalScore}점)",
            fontSize = 18.sp,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = "현재 라운드 포인트: ${uiState.gameData.currentPoint}",
            fontSize = 18.sp,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        Text(
            text = "목표 시간: ${formatTime(uiState.config.targetTimeMs)}",
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = "오차 범위: ±${formatTime(uiState.config.toleranceMs)}",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(bottom = 40.dp)
        )

        StopwatchDisplay(currentTimeMs = uiState.gameData.currentTimeMs)

        Spacer(modifier = Modifier.height(64.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = { viewModel.onStartClicked() },
                enabled = !uiState.gameData.isRunning
            ) {
                Text("Start", fontSize = 20.sp)
            }

            Button(
                onClick = { viewModel.onStopClicked(uiState.gameData.currentTimeMs) },
                enabled = uiState.gameData.isRunning
            ) {
                Text("Stop", fontSize = 20.sp)
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        uiState.feedbackMessage?.let { message ->
            Text(
                text = message,
                color = if (message.contains("정확")) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.error,
                fontSize = 22.sp
            )
        }
    }
}

@Composable
fun StopwatchDisplay(currentTimeMs: Long) {
    Text(
        text = formatTime(currentTimeMs),
        fontSize = 72.sp,
        color = MaterialTheme.colorScheme.onSurface
    )
}

fun formatTime(timeMs: Long): String {
    val totalSeconds = TimeUnit.MILLISECONDS.toSeconds(timeMs)
    val totalMillis = timeMs % 1000

    val seconds = totalSeconds
    val millis = totalMillis / 10


    return String.format("%02d.%02d", seconds, millis)
}

@Preview(showBackground = true)
@Composable
fun GameScreenPreview() {
    StopwatchGameTheme {
        GameScreen()
    }
}

@Preview(name = "Stopwatch Only", showBackground = true)
@Composable
fun StopwatchDisplayPreview() {
    StopwatchGameTheme {
        Column(
            modifier = Modifier.padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Running State Mock")
            StopwatchDisplay(currentTimeMs = 4567L)
            Spacer(modifier = Modifier.height(20.dp))
            Text("Stop State Mock")
            StopwatchDisplay(currentTimeMs = 5002L)
        }
    }
}