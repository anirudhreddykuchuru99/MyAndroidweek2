package com.action.myandroidweek2.hw.ui

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.action.myandroidweek2.hw.model.Product

@Composable
fun ProductItem(product: Product) {
    val context = LocalContext.current

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable {
                Toast.makeText(context, "Price: $${product.price}, Rating: ${product.rating}", Toast.LENGTH_SHORT).show()
            },
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth().padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = rememberAsyncImagePainter(product.imageUrl),
                contentDescription = "${product.name} + ${product.id}",
                modifier = Modifier.size(200.dp).padding(end = 16.dp)
            )
            Column(modifier = Modifier.weight(1f)) {
                Text(text = product.name, fontSize = 18.sp)
                Text(text = product.description, fontSize = 14.sp)
            }
        }
    }
}