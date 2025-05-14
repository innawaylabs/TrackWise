package com.innawaylabs.finance.transaction

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import java.util.UUID
import javax.inject.Inject
import kotlin.random.Random

class TransactionRepository @Inject constructor() {

    private val _transactions = MutableStateFlow<List<Transaction>>(generateFakeTransactions())
    val transactions: StateFlow<List<Transaction>> = _transactions

    fun updateCategory(transactionId: String, newCategory: Category) {
        val updatedList = _transactions.value.map { txn ->
            if (txn.id == transactionId) txn.copy(category = newCategory) else txn
        }
        _transactions.value = updatedList
    }

    private fun generateFakeTransactions(): List<Transaction> {
        val categories = Category.entries.toTypedArray()
        return List(10_000) { index ->
            Transaction(
                id = UUID.randomUUID().toString(),
                description = "Transaction ${index + 1}",
                amount = Random.nextDouble(5.0, 500.0),
                category = categories.random()
            )
        }
    }
}
