package com.example.aluvery.ui.components.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.model.Product
import com.example.aluvery.sampleData.sampleSaltyFood
import com.example.aluvery.ui.AluveryTheme
import com.example.aluvery.ui.components.ProductItem

@Composable
fun ProductSection(
    title: String,
    products: List<Product>,
    modifier: Modifier = Modifier
) {
    Section(
        title = {
            Text(
                text = title,
                modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight(400)
            )
                },
        content = {
            LazyRow(
                modifier = Modifier
                    .padding(top = 8.dp, bottom = 16.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(horizontal = 16.dp)
            ) {
                items(products) { product ->
                    ProductItem(product = product)
                }
            }
                   },
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun ProductSectionPreview() {
    AluveryTheme {
        Surface {
            ProductSection("Promoções", products = sampleSaltyFood)
        }
    }
}