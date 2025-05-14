package com.innawaylabs.finance.dashboard_widgets

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.innawaylabs.finance.dashboard_framework.DashboardWidget

class TransactionListWidget : DashboardWidget {
    override val id = "transaction_list"
    override val displayName = "Transactions List"

    @Composable
    override fun Render() {
        val viewModel: TransactionListViewModel = hiltViewModel()
        val transactions = viewModel.transactions.collectAsState()
        Column(modifier = Modifier.fillMaxSize()) {
            Button(
                onClick = { /* Handle button click */ },
                modifier = Modifier
                    .padding(16.dp) // Outer padding
            ) {
                Text(
                    text = stringResource(R.string.transaction_list_widget),
                    modifier = Modifier
                        .padding(8.dp) // Inner padding
                )
            }

            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f) // ✅ This ensures LazyColumn gets all available vertical space
            ) {
                items(transactions.value.take(100)) { txn ->
                    Text("${txn.description} | $${txn.amount} | ${txn.category}")
                }
            }
        }
    }
}
