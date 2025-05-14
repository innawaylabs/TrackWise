package com.innawaylabs.finance.trackwise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.innawaylabs.finance.dashboard_framework.DashboardHost
import com.innawaylabs.finance.dashboard_widgets.WidgetRegistry
import com.innawaylabs.finance.trackwise.ui.theme.TrackWiseTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrackWiseTheme {
                val widgets = WidgetRegistry.getRegisteredWidgets()
                DashboardHost(widgets, 64)
            }
        }
    }
}
