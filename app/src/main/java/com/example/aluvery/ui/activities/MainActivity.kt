package com.example.aluvery.ui.activities

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

        setContent {
            AluveryTheme {
                Surface {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    HomeScreen(sections = sampleSections)
//  AllProductsScreen(products = sampleProducts.plus(sampleDrinks).plus(sampleCandies))
}

@Preview
@Composable
fun AppPreview() {
    AluveryTheme {
        Surface {
            App()
        }
    }
}