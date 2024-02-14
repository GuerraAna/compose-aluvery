package com.example.aluvery.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.model.Product
import com.example.aluvery.sampleData.sampleCandies
import com.example.aluvery.sampleData.sampleDrinks
import com.example.aluvery.sampleData.sampleProducts
import com.example.aluvery.ui.components.ProductItem

@Composable
fun AllProductsScreen(products: List<Product>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalArrangement = Arrangement.SpaceBetween,
        contentPadding = PaddingValues(16.dp)
    ) {
        item(span = {
            GridItemSpan(maxLineSpan)
        }) {
            Text(text = "Todos os produtos", fontSize = 32.sp)
        }

        items(products) { product ->
            ProductItem(product = product)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AllProductsScreenPreview() {
    AllProductsScreen(products = sampleProducts.plus(sampleDrinks).plus(sampleCandies))
}