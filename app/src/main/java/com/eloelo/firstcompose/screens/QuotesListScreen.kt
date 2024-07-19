package com.eloelo.firstcompose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.eloelo.firstcompose.model.Quote

@Composable
fun QuotesListScreen(data: ArrayList<Quote>, onClick: (quote: Quote)->Unit) {
    Column {

        Text(text = "Quotes App",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 48.dp, bottom = 16.dp),
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center)

        QuotesList(data = data, onClick)
    }
}