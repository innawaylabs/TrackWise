package com.innawaylabs.finance.transaction

data class Transaction(
    val id: String,
    val description: String,
    val amount: Double,
    val category: Category
)
