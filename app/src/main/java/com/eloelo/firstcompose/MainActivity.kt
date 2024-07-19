package com.eloelo.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.eloelo.firstcompose.screens.QuotesItemDetail
import com.eloelo.firstcompose.screens.QuotesListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuoteApp()
            }

        }
    }


@Composable
fun QuoteApp() {
    if (DataManagement.currentPage.value == DataManagement.Pages.ListingPage){
        QuotesListScreen(data = DataManagement.data) {
            DataManagement.switchPages(it)
        }
    }
    else {
        DataManagement.currentQuote?.let { QuotesItemDetail(quote = it) }
    }

}