
package de.jensklingenberg.jetpackcomposeplayground.ui.samples.layout

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.material.MaterialTheme


/**
         * @see wiki [https://github.com/Foso/Jetpack-Compose-Playground/wiki/VerticalScroller]
         */

@Composable
fun VerticalScrollerExample() {
    VerticalScroller {
        //Only one child is allowed in a VerticalScroller
        Column {
            for (i in 0..100) {
                Text(text = "$i Hello World!", style =(MaterialTheme.typography()).body1)
            }
        }
    }
}