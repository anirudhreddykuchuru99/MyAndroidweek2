package com.action.myandroidweek2.hw

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.action.myandroidweek2.hw.ui.screens.ProductScreen
import com.action.myandroidweek2.viewmodel.ProductViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: ProductViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProductScreen(viewModel)
        }
    }
}
