package com.innawaylabs.finance.dashboard_widgets

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.innawaylabs.finance.transaction.Category
import com.innawaylabs.finance.transaction.Transaction
import com.innawaylabs.finance.transaction.TransactionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class TransactionListViewModel @Inject constructor(
    private val repository: TransactionRepository
) : ViewModel() {

    val transactions: StateFlow<List<Transaction>> =
        repository.transactions.stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000),
            initialValue = emptyList()
        )

    fun updateCategory(id: String, newCategory: Category) {
        repository.updateCategory(id, newCategory)
    }
}