package com.dyor.datastore

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "DataStore Sample",
    ) {
        App()
    }
}