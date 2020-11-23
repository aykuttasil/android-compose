package com.aykuttasil.composeplayground

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable


@Composable
fun MyApp(children: @Composable () -> Unit) {
    MaterialTheme {
        Text(text = "Selam")
        children()
    }
}
