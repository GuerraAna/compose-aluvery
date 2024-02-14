package com.example.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.aluvery.sampleData.sampleSections
import com.example.aluvery.ui.AluveryTheme
import com.example.aluvery.ui.screens.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent { App() }
    }
}

@Composable
fun App() {
    AluveryTheme {
        Surface {
//            AllProductsScreen(products = sampleProducts.plus(sampleDrinks).plus(sampleCandies))
            HomeScreen(sections = sampleSections)

        }
    }
}

@Preview
@Composable
fun AppPreview() {
    App()
}