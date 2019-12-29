package com.aykuttasil.composeplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.shape.border.Border
import androidx.ui.graphics.Color
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.Padding
import androidx.ui.layout.Row
import androidx.ui.layout.Spacing
import androidx.ui.material.Button
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                HomePage()
            }
        }
    }
}

@Composable
fun MyApp(children: @Composable() () -> Unit) {
    MaterialTheme {
        Padding(padding = 10.dp) {
            Surface(color = Color.Yellow, border = Border(color = Color.Black, width = 5.dp)) {
                children()
            }
        }
    }
}

@Composable
fun HomePage() {
    Column {
        HomePageList()

        Row(arrangement = Arrangement.Center) {
            Button(text = "Bas", onClick = {

            })
        }
    }
}

@Composable
fun HomePageList(list: List<String> = listOf("Aykut", "Kerem", "Asil")) {
    for (item in list) {
        Greeting(name = item)
        Divider(color = Color.Black)
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", modifier = Spacing(24.dp))
}

@Preview("App Preview")
@Composable
fun DefaultPreview() {
    MyApp {
        HomePage()
    }
}
