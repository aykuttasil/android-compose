package com.aykuttasil.composeplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.tooling.preview.Preview
import com.aykuttasil.composeplayground.ui.pages.home.HomePage

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

@Preview("App Preview")
@Composable
fun DefaultPreview() {
    MyApp {
        HomePage()
    }
}
