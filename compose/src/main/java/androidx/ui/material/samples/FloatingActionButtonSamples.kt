/*
 * Copyright 2019 The Android Open Source Project
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

package androidx.ui.material.samples


import androidx.compose.Composable
import androidx.ui.foundation.Image
import androidx.ui.graphics.ImageAsset
import androidx.ui.material.FloatingActionButton


@Composable
fun FloatingActionButtonSimple(icon: ImageAsset) {
    FloatingActionButton(icon = icon, onClick = { /*do something*/ })
}


@Composable
fun FloatingActionButtonCustomContent(icon: ImageAsset) {
    FloatingActionButton(onClick = { /*do something*/ }) {
        Image(image = icon)
    }
}


@Composable
fun FloatingActionButtonExtended(icon: ImageAsset) {
    FloatingActionButton(icon = icon, text = "ADD TO BASKET", onClick = { /*do something*/ })
}
