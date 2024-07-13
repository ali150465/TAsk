package com.routtask.my_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.routtask.R

@Composable
fun RouteAppBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .displayCutoutPadding(),
        horizontalArrangement = Arrangement.Start
    ) {
        Image(
            painter = painterResource(id = R.drawable.route),
            contentDescription = "route loge",
            modifier = Modifier
                .padding(start = 16.dp)
                .size(width = 75.dp, height = 55.dp)
        )
    }
}