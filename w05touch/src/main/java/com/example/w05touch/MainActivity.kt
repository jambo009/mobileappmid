package com.example.w05touch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.w05touch.ui.theme.W05touchTheme
import androidx.compose.foundation.shape.CircleShape

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            W05touchTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    ColorToggleButtonApp()
                }
            }
        }
    }
}

@Composable
fun ColorToggleButtonApp() {
    var currentColor by remember { mutableStateOf(Color.Red) }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .background(currentColor)
                .clickable {
                    currentColor = if (currentColor == Color.Red) Color.Blue else Color.Red
                }
                .padding(30.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Click Me",
                color = Color.White,
                fontSize = 30.sp
            )
        }
    }
}

@Preview(showBackground = true, widthDp = 300, heightDp = 300)
@Composable
fun ColorToggleButtonAppPreview() {
    W05touchTheme {
        ColorToggleButtonApp()
    }
}