package com.example.aluvery.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchTextField(searchText: String = "", onSearchChanged: (String) -> Unit) {
    OutlinedTextField(
        value = searchText,
        onValueChange = { newValue ->
            onSearchChanged(newValue)
        },
        modifier =
        Modifier
            .padding(
                start = 16.dp,
                end = 16.dp
            )
            .fillMaxWidth(),
        shape = RoundedCornerShape(100),
        leadingIcon =  { Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "buscar"
        ) },
        label = { Text(text = "Produto") },
        placeholder = { Text("O que você procura?") }
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SearchTextFieldPreview() {
    SearchTextField(onSearchChanged = { "" })
}