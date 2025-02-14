package com.action.myandroidweek2.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import com.action.myandroidweek2.hw.model.Product
import com.action.myandroidweek2.hw.model.ProductRepository

class ProductViewModel : ViewModel() {
    private val _products = MutableStateFlow(ProductRepository.getProducts())
    val products: StateFlow<List<Product>> get() = _products
}