package com.example.aluvery.sampleData

import com.example.aluvery.R
import com.example.aluvery.model.Product
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