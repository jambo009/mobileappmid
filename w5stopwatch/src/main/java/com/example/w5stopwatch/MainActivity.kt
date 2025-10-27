package com.example.w5stopwatch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.w5stopwatch.ui.theme.W5stopwatchTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            W5stopwatchTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    StopWatchApp()
                }
            }
        }
    }
}

@Composable
fun StopWatchApp() {
    var timeInMillis by remember { mutableStateOf(0L) }
    var isRunning by remember { mutableStateOf(false) }

    LaunchedEffect(key1 = isRunning) {
        if (isRunning) {
            while (true) {
                delay(10L)
                timeInMillis += 10L
            }
        }
    }

    StopwatchScreen(
        timeInMillis = timeInMillis,
        onStartClick = { isRunning = true },
        onStopClick = { isRunning = false },
        onResetClick = {
            isRunning = false
            timeInMillis = 0L
        }
    )
}

@Composable
fun StopwatchScreen(
    timeInMillis: Long,
    onStartClick: () -> Unit,
    onStopClick: () -> Unit,
    onResetClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = formatTime(timeInMillis),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )

        Row {
            Button(onClick = onStartClick) { Text("Start") }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = onStopClick) { Text("Stop") }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = onResetClick) { Text("Reset") }
        }
    }
}

private fun formatTime(timeInMillis: Long): String {
    val minutes = (timeInMillis / 1000) / 60
    val seconds = (timeInMillis / 1000) % 60
    val millis = (timeInMillis % 1000) / 10
    return String.format("%02d:%02d:%02d", minutes, seconds, millis)
}

@Preview(showBackground = true)
@Composable
fun StopWatchPreview() {
    W5stopwatchTheme {
        StopWatchApp()
    }
}