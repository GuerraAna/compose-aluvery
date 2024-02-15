package com.example.aluvery.ui.activities

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.aluvery.R
import com.example.aluvery.model.Product
import com.example.aluvery.ui.AluveryTheme
import java.math.BigDecimal

class ProductFormActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AluveryTheme {
                Surface { ProductFormScreen() }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun ProductFormScreen() {
    val keyboardController = LocalSoftwareKeyboardController.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
            .verticalScroll(rememberScrollState())
            .clickable { keyboardController?.hide() },
        verticalArrangement = Arrangement.spacedBy(16.dp),
        content = {
            Spacer(modifier = Modifier)

            Text(text = "Criando o produto", Modifier.fillMaxWidth(), fontSize = 28.sp)

            var url by remember { mutableStateOf("") }

            if (url.isNotBlank()) {
                AsyncImage(
                    model = url, contentDescription = null,
                    Modifier
                        .fillMaxWidth()
                        .height(200.dp),
                    contentScale = ContentScale.Crop,
                    placeholder = painterResource(id = R.drawable.ic_launcher_background),
                    error = painterResource(id = R.drawable.ic_launcher_background)
                )
            }

            TextField(
                value = url,
                onValueChange = { url = it },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next
                ),
                label = { Text(text = "URL da imagem") }
            )

            var name by remember { mutableStateOf("") }
            TextField(
                value = name,
                onValueChange = { name = it },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next
                ),
                label = { Text(text = "nome do produto") }
            )

            var price by remember { mutableStateOf("") }
            TextField(
                value = price,
                onValueChange = { price = it },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal,
                    imeAction = ImeAction.Next
                ),
                label = { Text(text = "preço do produto") }
            )

            var description by remember { mutableStateOf("") }
            TextField(
                value = description,
                onValueChange = { description = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                ),
                label = { Text(text = "descrição do produto") }
            )

            val newPrice = try {
                BigDecimal(price)
            } catch (error: NumberFormatException) {
                BigDecimal.ZERO
            }

            Button(
                onClick = {
                    val product = Product(
                        name = name,
                        price = newPrice,
                        image = url,
                        description = description
                    )

                    Log.i("ProductFormActivity", "ProductFormScreen: $product")
                },
                modifier = Modifier.fillMaxWidth()
            ) { Text(text = "Salvar") }

            Spacer(modifier = Modifier)
        }
    )
}

@Preview(showSystemUi = true)
@Composable
fun ProductFormScreenPreview() {
    AluveryTheme {
        Surface {
            ProductFormScreen()
        }
    }
}