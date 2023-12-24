package com.example.aluvery.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ExitToApp
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.sampleData.sampleProducts
import com.example.aluvery.ui.Purple700
import com.example.aluvery.ui.components.ProductSection

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = { ScaffoldTopBar() }
    ) {
        Box(
            modifier = Modifier.padding(it)
        ) {
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
    HomeScreen()
}