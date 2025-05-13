package com.innawaylabs.finance.dashboard_widgets

import com.innawaylabs.finance.dashboard_framework.DashboardWidget

object WidgetRegistry {
    fun getRegisteredWidgets(): List<DashboardWidget> {
        return listOf(TransactionListWidget(), SpendingSummaryWidget(), AIInsightsWidget())
    }
}
