package dev.playground

import androidx.ui.demos.ComposableDemo
import androidx.ui.demos.DemoCategory

val PlaygroundDemos = DemoCategory("Playground Demos", listOf(
    ComposableDemo("DrawLayout Demo") { InteractiveLayoutDemo() }
))