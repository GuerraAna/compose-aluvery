package com.example.aluvery.ui.components.section

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Section(
    title: @Composable () -> Unit,
    content: @Composable () -> Unit,
    modifier: Modifier
) {
    Column(modifier = modifier) {
        title()
        content()
    }
}