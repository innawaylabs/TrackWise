package com.innawaylabs.finance.dashboard_widgets

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.innawaylabs.finance.dashboard_framework.DashboardWidget

class SpendingSummaryWidget : DashboardWidget {

    override val id = "spending_summary"
    override val displayName = "Spending Summary"

    @Composable
    override fun Render() {
        Button(
            onClick = { /* Handle button click */ },
            modifier = androidx.compose.ui.Modifier
                .padding(16.dp) // Outer padding
        ) {
            Text(
                text = stringResource(R.string.spending_summary_widget),
                modifier = androidx.compose.ui.Modifier
                    .padding(8.dp) // Inner padding
            )
        }
    }
}
