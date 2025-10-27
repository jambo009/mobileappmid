package com.example.w04overalpped

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Badge
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.w04overalpped.ui.theme.ComposeLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLabTheme {
                NinjaBadgeExample()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NinjaBadgeExample() {
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {

        Image(
            painter = painterResource(id = R.drawable.ninja),
            contentDescription = "Ninja Image",
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(8.dp)
                .shadow(
                    elevation = 8.dp,
                    shape = MaterialTheme.shapes.small
                )
        ) {
            Badge(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary
            ) {
                Text(text = "AI Powered")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewNinjaBadgeExample() {
    ComposeLabTheme {
        NinjaBadgeExample()
    }
}