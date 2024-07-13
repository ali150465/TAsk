package com.routtask.my_app

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.routtask.viewModel.AppViewModel

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun ScreenContent(viewModel: AppViewModel = hiltViewModel()) {

    val products by viewModel.products.collectAsState()
    LaunchedEffect(Unit) {
        viewModel.getProducts()
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .displayCutoutPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        RouteAppBar()
        SearchRow()
        if (products != null)
            if (products!!.products.isEmpty()) {
                Text(text = "No products found")
            }
            else
        ListOfProduct(product = products!!.products)
    }
}
