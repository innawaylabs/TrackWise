package com.innawaylabs.finance.dashboard_widgets

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.innawaylabs.finance.dashboard_framework.DashboardWidget

class TransactionListWidget : DashboardWidget {
    override val id = "transaction_list"
    override val displayName = "Transactions"

    @Composable
    override fun Render() {
        Text("This is the Transaction Widget")
    }
}
