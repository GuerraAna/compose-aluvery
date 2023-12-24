package com.example.aluvery.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aluvery.R
import com.example.aluvery.model.Store

@Composable
fun StoreItem(store: Store) {
    Surface {
        val imageSize = 100.dp

        Column {
            Image(
                painter = painterResource(store.imageView),
                contentDescription = null,
                modifier = Modifier
                    .size(size = imageSize)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )

            Text(text = store.name)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StoreItemPreview() {
    StoreItem(
        store = Store(
            name = "Teste",
            imageView = R.drawable.ic_launcher_background
        )
    )
}