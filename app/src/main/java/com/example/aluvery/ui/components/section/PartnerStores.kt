package com.example.aluvery.ui.components.section

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.model.Store
import com.example.aluvery.sampleData.sampleStores
import com.example.aluvery.ui.components.StoreItem

@Composable
fun PartnerStoresSection(
    title: String,
    stores: List<Store>,
    modifier: Modifier = Modifier
) {
    Section(
        title = {
            Text(
                text = title,
                modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight(400)
            )
                },
        content = {
                  Row(
                      modifier = Modifier
                          .padding(top = 16.dp, bottom = 16.dp)
                          .fillMaxWidth()
                          .padding(horizontal = 16.dp)
                          .horizontalScroll(rememberScrollState()),
                      horizontalArrangement = Arrangement.spacedBy(16.dp)
                  ) {
                      for (store in stores) {
                          StoreItem(store = store)
                      }
                  }
        },
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun PartnerStoresSectionPreview() {
    PartnerStoresSection(
        title = "Lojas Parceiras",
        stores = sampleStores
    )
}