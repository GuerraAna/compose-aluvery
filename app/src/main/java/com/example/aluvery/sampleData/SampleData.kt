package com.example.aluvery.sampleData

import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.example.aluvery.R
import com.example.aluvery.model.Product
import com.example.aluvery.model.Store
import java.math.BigDecimal

val sampleCandies = listOf(
    Product(
        name = "Chocolate",
        price = BigDecimal("3.99"),
        image = "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg"
    ),
    Product(
        name = "Sorvete",
        price = BigDecimal("5.99"),
        image = "https://images.pexels.com/photos/1352278/pexels-photo-1352278.jpeg",
        description = LoremIpsum(10).values.first()
    ),
    Product(
        name = "Bolo",
        price = BigDecimal("11.99"),
        image = "https://images.pexels.com/photos/291528/pexels-photo-291528.jpeg",
        description = LoremIpsum(10).values.first()
    )
)

val sampleDrinks = listOf(
    Product(
        name = "Cervejas",
        price = BigDecimal("5.99"),
        image = "https://images.pexels.com/photos/1552630/pexels-photo-1552630.jpeg",
        description = LoremIpsum(10).values.first()
    ),
    Product(
        name = "Vinhos",
        price = BigDecimal("4.99"),
        image = "https://images.pexels.com/photos/2775860/pexels-photo-2775860.jpeg",
        description = LoremIpsum(10).values.first()
    ),
    Product(
        name = "Sucos",
        price = BigDecimal("7.99"),
        image = "https://images.pexels.com/photos/96974/pexels-photo-96974.jpeg",
        description = LoremIpsum(10).values.first()
    ),
    Product(
        name = "Água (com/sem gás)",
        price = BigDecimal("2.99"),
        image = "https://images.pexels.com/photos/327090/pexels-photo-327090.jpeg"
    )
)

val sampleSaltyFood: List<Product> = listOf(
    Product(
        name = "Lasanha de berinjela",
        price = BigDecimal("12.99"),
        image = "https://i1.wp.com/biosom.com.br/blog/wp-content/uploads/2015/06/lasanha-de-berinjela.jpg?fit=3264%2C2448&ssl=1",
        description = LoremIpsum(10).values.first()
    ),
    Product(
        name = "Pizzas",
        price = BigDecimal("19.99"),
        image = "https://images.pexels.com/photos/825661/pexels-photo-825661.jpeg",
        description = LoremIpsum(10).values.first()
    ),
    Product(
        name = "Batata rústica",
        price = BigDecimal("7.99"),
        image = "https://images.pexels.com/photos/1583884/pexels-photo-1583884.jpeg",
        description = LoremIpsum(10).values.first()
    )
)

val sampleProducts = listOf(
    sampleSaltyFood,
    sampleCandies,
    sampleDrinks
)

val sampleStores = listOf(
    Store(
        name = "Floricultura",
        imageView = R.drawable.flower_shop
    ),
    Store(
        name = "Loja de roupas",
        imageView = R.drawable.clothing_store
    ),
    Store(
        name = "Papelaria",
        imageView = R.drawable.stationery_store
    ),
    Store(
        name = "Hoteis",
        imageView = R.drawable.hotel_store
    )
)

val sampleSections = mapOf(
    "Promoções" to sampleSaltyFood,
    "Doces" to sampleCandies,
    "Bebidas" to sampleDrinks
)
