package com.eloelo.firstcompose.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.eloelo.firstcompose.model.Quote


@Composable
fun QuotesList(data: ArrayList<Quote> , onClick: (quote: Quote)->Unit) {

    LazyColumn(content = {
        items(data) {
            QuotesItem(quote = it, onClick)
        }
    })
}