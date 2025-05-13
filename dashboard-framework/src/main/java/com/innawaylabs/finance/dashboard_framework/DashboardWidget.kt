package com.innawaylabs.finance.dashboard_framework

import androidx.compose.runtime.Composable

interface DashboardWidget {
    val id: String
    val displayName: String
    @Composable fun Render()
}