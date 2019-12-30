package com.aykuttasil.composeplayground

import androidx.compose.Composable
import androidx.ui.core.dp
import androidx.ui.foundation.shape.border.Border
import androidx.ui.graphics.Color
import androidx.ui.layout.Padding
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface

@Composable
fun MyApp(children: @Composable() () -> Unit) {
    MaterialTheme {
        Padding(padding = 5.dp) {
            Surface(
                color = Color.Cyan,
                border = Border(color = Color.Black, width = 3.dp)
            ) {
                children()
            }
        }
    }
}
