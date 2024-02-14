package com.example.aluvery.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.aluvery.R
import com.example.aluvery.extensions.toBrazilianCurrency
import com.example.aluvery.model.Product
import com.example.aluvery.ui.AluveryTheme
import java.math.BigDecimal

@Composable
fun CardProductItem(
    product: Product,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .heightIn(150.dp)
    ) {
        Column {
            AsyncImage(
                model = product.image,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                placeholder = painterResource(id = R.drawable.ic_launcher_background),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Yellow)
                    .padding(16.dp)
            ) {
                Text(text = product.name)
                Text(text = product.price.toBrazilianCurrency())
            }

            product.description?.let {
                Text(
                    text = product.description,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun CardProductItemPreview() {
    AluveryTheme {
        Surface {
            CardProductItem(
                product = Product(name = "teste", price = BigDecimal(99)),
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
    }
}

@Preview
@Composable
private fun CardProductItemWithDescriptionPreview() {
    AluveryTheme {
        Surface {
            CardProductItem(
                product = Product(
                    name = "teste com descrição",
                    price = BigDecimal(99),
                    description = LoremIpsum(10).values.first()
                ),
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
    }
}