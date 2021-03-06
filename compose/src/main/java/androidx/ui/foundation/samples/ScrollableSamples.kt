/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.ui.foundation.samples


import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.foundation.Box
import androidx.ui.foundation.ContentGravity
import androidx.ui.core.Text
import androidx.ui.foundation.gestures.DragDirection
import androidx.ui.foundation.gestures.Scrollable
import androidx.ui.foundation.gestures.ScrollableState
import androidx.ui.graphics.Color
import androidx.ui.layout.LayoutSize
import androidx.ui.text.TextStyle
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import kotlin.math.roundToInt


@Composable
fun ScrollableSample() {
    // actual composable state
    val offset = state { 0f }
    // state for Scrollable, describes how to consume scrolling delta and update offset
    val scrollableState = ScrollableState(
        onScrollDeltaConsumptionRequested = { delta ->
            offset.value += delta
            delta
        }
    )
    Scrollable(dragDirection = DragDirection.Vertical, scrollableState = scrollableState) {
        Box(
            LayoutSize(200.dp),
            backgroundColor = Color.LightGray,
            gravity = ContentGravity.Center
        ) {
            Text(offset.value.roundToInt().toString(), style = TextStyle(fontSize = 50.sp))
        }
    }
}