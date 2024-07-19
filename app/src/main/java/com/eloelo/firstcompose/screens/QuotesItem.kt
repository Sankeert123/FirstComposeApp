package com.eloelo.firstcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eloelo.firstcompose.model.Quote


@Composable
fun QuotesItem(quote: Quote, onClick:(quote: Quote)->Unit) {

    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable {  onClick(quote)  },
        elevation = CardDefaults.cardElevation(4.dp)

    ) {
        Row (modifier = Modifier.padding(16.dp)){

            Image(
                imageVector = Icons.Filled.AccountBox,
                contentDescription = "",
                modifier = Modifier
                    .size(48.dp)
                    .background(Color.Gray),
                alignment = Alignment.TopStart,
                )

            Spacer(modifier = Modifier.padding(4.dp))

            Column (modifier = Modifier.weight(1f)){
                Text(
                    text = quote.title,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 8.dp),
                    maxLines = 2
                    )

                Box(modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth(0.4f)
                    .background(Color.Gray))

                Text(
                    text = quote.Author,
                    modifier = Modifier.padding(top = 4.dp),
                    style = MaterialTheme.typography.labelSmall)
            }

        }
        
    }

}
