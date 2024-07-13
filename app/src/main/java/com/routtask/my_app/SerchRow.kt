package com.routtask.my_app

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.routtask.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchRow() {
    Row(modifier = Modifier.fillMaxWidth()) {
        var text by remember { mutableStateOf("") }
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("what are you looking for?", fontSize = 14.sp) },
            modifier = Modifier
                .weight(0.75f)
                .padding(start = 8.dp),
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done
            ), shape = RoundedCornerShape(30.dp),
            colors =TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = colorResource(id = R.color.color_app),
                unfocusedBorderColor = colorResource(id = R.color.color_app),
            ),maxLines = 1,minLines = 1
        )

        IconButton(
            onClick = {  },
            modifier = Modifier
                .weight(0.2f)
                .padding(8.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.shopping),
                contentDescription = "search",
                modifier = Modifier.size(30.dp),
                tint = colorResource(id = R.color.color_app)
            )
        }
    }
}