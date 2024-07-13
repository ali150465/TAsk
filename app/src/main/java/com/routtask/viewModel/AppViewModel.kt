package com.routtask.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.entity.ProductResponse
import com.example.domain.usecase.GetProducts
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AppViewModel @Inject constructor(private val getProductsUseCase: GetProducts) : ViewModel() {
    private val _products: MutableStateFlow<ProductResponse?> = MutableStateFlow(null)
    val products: StateFlow<ProductResponse?> = _products

    suspend fun getProducts() {
        viewModelScope.launch {
            try {
                _products.value = getProductsUseCase()
            } catch (e: Exception) {
                Log.e("AppViewModel", "Error fetching products", e)
            }
        }
    }
}