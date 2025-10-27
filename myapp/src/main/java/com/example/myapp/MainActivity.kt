package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myapp.simplegrid.ui.theme.SimpleGridTheme
import kotlin.random.Random
import androidx.compose.ui.draw.alpha


const val GRID_SIZE = 4

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleGridTheme {
                SimpleGridScreen()
            }
        }
    }
}

@Composable
fun SimpleGridScreen() {
    val isInteractionEnabled = remember { mutableStateOf(true) }

    val cellColors = remember {
        List(GRID_SIZE * GRID_SIZE) {
            mutableStateOf(Color(0xFF2C3E50))
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF000A1A))
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            repeat(GRID_SIZE) { row ->
                Row(
                    modifier = Modifier.fillMaxWidth().weight(1f),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    repeat(GRID_SIZE) { col ->
                        val index = row * GRID_SIZE + col
                        GridCell(
                            currentColor = cellColors[index].value,
                            isClickable = isInteractionEnabled.value,
                            onTap = {
                                cellColors[index].value = getRandomBrightColor()
                            }
                        )
                    }
                }
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(Color.Black.copy(alpha = 0.5f))
                .padding(16.dp)
        ) {
            Text(
                text = "「단순한 그리드: 상태에 따라 변화하는 상호작용」",
                color = Color(0xFF1ABC9C),
                fontSize = 20.sp,
                style = MaterialTheme.typography.titleLarge
            )

            Spacer(modifier = Modifier.height(8.dp))

            Button(
                onClick = {
                    isInteractionEnabled.value = !isInteractionEnabled.value
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (isInteractionEnabled.value) Color(0xFFE74C3C) else Color(0xFF1ABC9C)
                )
            ) {
                Text(
                    text = if (isInteractionEnabled.value) "(Stop)" else "(Start)",
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Composable
fun RowScope.GridCell(currentColor: Color, isClickable: Boolean, onTap: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .weight(1f)
            .background(currentColor, shape = MaterialTheme.shapes.small)
            .then(
                if (isClickable) Modifier.clickable { onTap() }
                else Modifier.clickable(enabled = false, onClick = {})
            )
            .alpha(if (isClickable) 1.0f else 0.5f)
    )
}

fun getRandomBrightColor(): Color {
    return when(Random.nextInt(5)) {
        0 -> Color(0xFF1ABC9C)
        1 -> Color(0xFF3498DB)
        2 -> Color(0xFFE74C3C)
        3 -> Color(0xFFF1C40F)
        else -> Color(0xFF9B59B6)
    }
}

@Preview(showBackground = true)
@Composable
fun SimpleGridPreview() {
    SimpleGridTheme {
        SimpleGridScreen()
    }
}