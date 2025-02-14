package com.action.myandroidweek2.hw.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.action.myandroidweek2.viewmodel.ProductViewModel
import com.action.myandroidweek2.hw.ui.ProductItem

@Composable
fun ProductScreen(viewModel: ProductViewModel) {

    val products by viewModel.products.collectAsStateWithLifecycle()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {

        LazyColumn(
            modifier = Modifier.padding(16.dp)
        ) {
            items(products) { product ->
                ProductItem(product = product)
            }
        }
    }
}
