package com.example.aluvery.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ExitToApp
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.model.Product
import com.example.aluvery.sampleData.sampleProducts
import com.example.aluvery.sampleData.sampleSections
import com.example.aluvery.sampleData.sampleStores
import com.example.aluvery.ui.AluveryTheme
import com.example.aluvery.ui.Purple700
import com.example.aluvery.ui.components.CardProductItem
import com.example.aluvery.ui.components.SearchTextField
import com.example.aluvery.ui.components.section.PartnerStoresSection
import com.example.aluvery.ui.components.section.ProductSection

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    sections: Map<String, List<Product>>,
    searchText: String = ""
) {
    var text by remember { mutableStateOf(searchText) }

    val searchedProducts = remember(text) {
        if (text.isNotBlank()) {
            sampleProducts.filter { product ->
                product.name.contains(text, ignoreCase = true) ||
                        product.description?.contains(text, ignoreCase = true) ?: false
            }
        } else emptyList()
    }

    Scaffold(
        topBar = { ScaffoldTopBar() }
    ) {
        Box(
            modifier = Modifier.padding(it)
        ) {

            Surface {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    contentPadding = PaddingValues(vertical = 16.dp)
                ) {

                    item {
                        SearchTextField(
                            searchText = text,
                            onSearchChanged = { newValue -> text = newValue }
                        )
                    }

                    when (text.isBlank()) {
                        true -> {
                            item {
                                for (section in sections) {
                                    val title = section.key
                                    val products = section.value

                                    ProductSection(
                                        title = title,
                                        products = products
                                    )
                                }

                                PartnerStoresSection(title = "Lojas Parceiras", stores = sampleStores)

                            }
                        }

                        else -> {
                            items(searchedProducts) { product ->
                                CardProductItem(
                                    product = product,
                                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ScaffoldTopBar() {
    Row(
        modifier = Modifier
            .background(Purple700)
            .padding(12.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            Icons.Rounded.Home,
            contentDescription = null,
            tint = Color.White
        )

        Text(
            text = "Aluvery",
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 22.sp
        )

        Icon(
            Icons.Rounded.ExitToApp,
            contentDescription = null,
            tint = Color.White
        )
    }
}

@Preview(showBackground = true, name = "product_item", showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    AluveryTheme {
        Surface {
            HomeScreen(sections = sampleSections)
        }
    }
}

@Preview(showBackground = true, name = "product_item_searched", showSystemUi = true)
@Composable
fun HomeScreenWithSearchedTextPreview() {
    AluveryTheme {
        Surface {
            HomeScreen(sections = sampleSections, searchText = "as")
        }
    }
}