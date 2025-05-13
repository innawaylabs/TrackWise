package com.innawaylabs.finance.dashboard_widgets

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.innawaylabs.finance.dashboard_framework.DashboardWidget

class AIInsightsWidget : DashboardWidget {
    override val id = "ai_insights"
    override val displayName = "AI Insights"

     @Composable
     override fun Render() {
         Button(
             onClick = { /* Handle button click */ },
             modifier = androidx.compose.ui.Modifier
                 .padding(16.dp) // Outer padding
         ) {
             Text(
                 text = stringResource(R.string.ai_insights_widget),
                 modifier = androidx.compose.ui.Modifier
                     .padding(8.dp) // Inner padding
             )
         }
     }
}