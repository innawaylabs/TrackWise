package com.innawaylabs.finance.dashboard_framework

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable

@Composable
fun DashboardHost(widgets: List<DashboardWidget>) {
    LazyColumn {
        items(widgets, key = { it.id }) { widget ->
            widget.Render()
        }
    }
}