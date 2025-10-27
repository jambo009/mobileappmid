package com.myapp.simplegrid.ui.theme

import androidx.compose.ui.graphics.Color

val DarkBackground = Color(0xFF000A1A)
val PrimaryColor = Color(0xFF1ABC9C)
val SecondaryColor = Color(0xFF3498DB)
val AccentColor = Color(0xFFE74C3C)

val White = Color(0xFFFFFFFF)
val Gray = Color(0xFF888888)

val DarkColorScheme = androidx.compose.material3.darkColorScheme(
    primary = PrimaryColor,
    onPrimary = DarkBackground,
    primaryContainer = SecondaryColor,
    onPrimaryContainer = White,

    surface = DarkBackground,
    background = DarkBackground,
    onSurface = White,
    onBackground = White,

    secondary = SecondaryColor,
    onSecondary = DarkBackground,
)