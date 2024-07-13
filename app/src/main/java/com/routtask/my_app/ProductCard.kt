package com.routtask.my_app

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.domain.entity.Product
import com.routtask.R


@OptIn(ExperimentalMaterial3Api::class, ExperimentalGlideComposeApi::class)
@Composable
fun ProductCard(products: Product) {
    Card(
        modifier = Modifier
            .size(210.dp, 270.dp)
            .padding(8.dp),
        onClick = { },
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(1.dp, color = colorResource(id = R.color.color_app)),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Box(modifier = Modifier.weight(0.5f)) {
            GlideImage(
                model = products.images.first(),
                contentDescription = "Product Image",
                modifier = Modifier
                    .padding(4.dp, 2.dp)
                    .fillMaxWidth()
                    .height(150.dp)
            )
            IconButton(
                onClick = { },
                modifier = Modifier.align(Alignment.TopEnd),
                colors = IconButtonDefaults.iconButtonColors(
                    contentColor = colorResource(id = R.color.color_app),
                    containerColor = colorResource(id = R.color.white)
                )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.favorait),
                    contentDescription = null,
                    modifier = Modifier.size(30.dp),
                    tint = colorResource(id = R.color.color_app)
                )
            }
        }
        Column(
            modifier = Modifier
                .weight(0.5f)
                .padding(10.dp)
        ) {

            Text(text = products.title, modifier = Modifier, fontSize = 18.sp, maxLines = 1)
            Text(
                text = products.description,
                modifier = Modifier,
                fontSize = 16.sp,
                maxLines = 1
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = products.price.toString(),
                    modifier = Modifier,
                    fontSize = 16.sp,
                    maxLines = 1
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text( text = "Review (${products.rating})", modifier = Modifier, fontSize = 14.sp)
                Spacer(modifier = Modifier.width(4.dp))
                Icon(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = null,
                    tint = Color.Yellow,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.weight(0.5f))
                IconButton(
                    onClick = { },
                    colors = IconButtonDefaults.iconButtonColors(
                        contentColor = Color.White,
                        containerColor = colorResource(id = R.color.color_app)
                    ), modifier = Modifier.size(30.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_add),
                        contentDescription = null,
                    )
                }
            }
        }
    }
}
