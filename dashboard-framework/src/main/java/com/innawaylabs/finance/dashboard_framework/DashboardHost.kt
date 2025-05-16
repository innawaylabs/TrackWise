package com.innawaylabs.finance.dashboard_framework

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun DashboardHost(widgets: List<DashboardWidget>, padding: Int) {
    LazyColumn (modifier = androidx.compose.ui.Modifier.padding(top = padding.dp)) {
        items(widgets, key = { it.id }) { widget ->
            androidx.compose.foundation.layout.Box(
                modifier = androidx.compose.ui.Modifier
                    .fillMaxWidth()
            ) {
                widget.Render()
            }
        }
    }
}