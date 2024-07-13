package com.routtask.my_app

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.domain.entity.Product

@Composable
fun ListOfProduct( product: List<Product>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .padding(top = 4.dp, bottom = 46.dp)
    ) {
        items(product.size) {
            ProductCard(
                product[it],
            )
        }
    }
}