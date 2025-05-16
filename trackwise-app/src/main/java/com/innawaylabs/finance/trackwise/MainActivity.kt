package com.innawaylabs.finance.trackwise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.innawaylabs.finance.dashboard_framework.DashboardHost
import com.innawaylabs.finance.dashboard_widgets.WidgetRegistry
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            setContent {
                Surface(modifier = Modifier.fillMaxSize(), color = Color.White) {
                    val widgets = WidgetRegistry.getRegisteredWidgets()
                    DashboardHost(widgets, 64)
                }
            }
        }
    }
}
