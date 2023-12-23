package com.example.aluvery.extensions

import java.math.BigDecimal
import java.text.NumberFormat
import java.util.Locale

/**
 * Format an BigDecimal number to brazilian format
 */
fun BigDecimal.toBrazilianCurrency(): String =
    NumberFormat.getCurrencyInstance(Locale("pt", "br")).format(this)