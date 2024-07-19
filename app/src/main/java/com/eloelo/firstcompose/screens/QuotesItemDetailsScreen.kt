package com.eloelo.firstcompose.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eloelo.firstcompose.DataManagement
import com.eloelo.firstcompose.model.Quote


@Composable
fun QuotesItemDetail(quote: Quote) {

    BackHandler {
        DataManagement.switchPages(null)
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.linearGradient(
                    colors = listOf(Color.Green, Color.White, Color.Blue)
                )
            )
    ) {
        Card (
            elevation = CardDefaults.cardElevation(4.dp),
            modifier = Modifier
                .padding(32.dp)
        ) {
            Column (
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(16.dp, 24.dp)
            ){
                Image(
                    imageVector = Icons.Filled.AddCircle,
                    contentDescription = "",
                    modifier = Modifier
                        .size(68.dp)
                        .background(Color.Gray))

                Spacer(modifier = Modifier.padding(8.dp))

                Text(
                    text = quote.title,
                    maxLines = 2,
                    style = MaterialTheme.typography.titleLarge)

                Spacer(modifier = Modifier.padding(8.dp))

                Text(
                    text = quote.Author,
                    maxLines = 1,
                    style = MaterialTheme.typography.titleSmall)
            }

        }

    }

}