package com.innawaylabs.finance.dashboard_widgets

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.innawaylabs.finance.dashboard_framework.DashboardWidget

class TransactionListWidget : DashboardWidget {
    override val id = "transaction_list"
    override val displayName = "Transactions List"

    @Composable
    override fun Render() {
        Button(
            onClick = { /* Handle button click */ },
            modifier = androidx.compose.ui.Modifier
                .padding(16.dp) // Outer padding
        ) {
            Text(
                text = stringResource(R.string.transaction_list_widget),
                modifier = androidx.compose.ui.Modifier
                    .padding(8.dp) // Inner padding
            )
        }
    }
}
