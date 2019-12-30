package com.aykuttasil.composeplayground.ui.pages.home

import androidx.compose.Composable
import androidx.compose.Model
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.Expanded
import androidx.ui.layout.ExpandedHeight
import androidx.ui.layout.Height
import androidx.ui.layout.HeightSpacer
import androidx.ui.layout.Row
import androidx.ui.layout.Spacing
import androidx.ui.material.Button
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.withOpacity
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import com.aykuttasil.composeplayground.R
import com.aykuttasil.composeplayground.ui.dialogs.presentDialog
import com.aykuttasil.composeplayground.ui.dialogs.showDialogState

@Model
class CounterState(var counter: Int = 0)

@Composable
fun HomePage(counterState: CounterState = CounterState()) {
    val image = +imageResource(R.drawable.header)
    // val openDialog = +state { true }
    Column(modifier = ExpandedHeight wraps Spacing(16.dp)) {
        Container(modifier = Height(180.dp) wraps Expanded) {
            Clip(shape = RoundedCornerShape(10.dp)) {
                DrawImage(image = image)
            }
        }

        HeightSpacer(height = 30.dp)

        Column(modifier = Flexible(1f)) {
            HomePageList()
            HomePageList()
            HomePageList()
        }

        presentDialog()

        Row {
            Button(
                text = "Bas - ${counterState.counter}",
                onClick = {
                    counterState.counter++
                }
            )

            Button(
                text = "Show AlertDialog",
                onClick = {
                    showDialogState.value = true
                }
            )
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
    val typography = +MaterialTheme.typography()
    Text(
        text = "Hello $name!",
        modifier = Spacing(24.dp),
        style = typography.caption.withOpacity(0.87f),
        maxLines = 2,
        overflow = TextOverflow.Ellipsis
    )
}