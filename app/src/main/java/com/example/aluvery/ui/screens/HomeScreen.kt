package com.example.aluvery.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aluvery.sampleData.sampleProducts
import com.example.aluvery.ui.AluveryTheme
import com.example.aluvery.ui.components.ProductSection

@Composable
fun HomeScreen() {
    AluveryTheme {
        Surface {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())

            ) {
                ProductSection(title = "Promoções", products = sampleProducts)
                ProductSection(title = "Doces", products = sampleProducts)
                ProductSection(title = "Bebidas", products = sampleProducts)
            }
        }
    }
}

@Preview(showBackground = true, name = "product_item", showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}