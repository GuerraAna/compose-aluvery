package com.example.aluvery.sampleData

import com.example.aluvery.R
import com.example.aluvery.model.Product
import com.example.aluvery.model.Store
import java.math.BigDecimal

val sampleProducts = listOf(
    Product(
        name = "Hamburguer",
        price = BigDecimal(36.90),
        imageView = R.drawable.burger
    ),
    Product(
        name = "Pizza",
        price = BigDecimal(80),
        imageView = R.drawable.pizza
    ),
    Product(
        name = "Batata frita",
        price = BigDecimal(15),
        imageView = R.drawable.fries
    )
)

val sampleStores = listOf(
    Store(
        name = "Floricultura",
        imageView = R.drawable.pizza
    ),
    Store(
        name = "Loja de roupas",
        imageView = R.drawable.pizza
    ),
    Store(
        name = "Papelaria",
        imageView = R.drawable.pizza
    ),
    Store(
        name = "Hoteis",
        imageView = R.drawable.pizza
    )
)