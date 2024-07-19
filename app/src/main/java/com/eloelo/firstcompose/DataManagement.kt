package com.eloelo.firstcompose

import androidx.compose.runtime.mutableStateOf
import com.eloelo.firstcompose.model.Quote

object DataManagement {


      val data : ArrayList<Quote> by lazy { getDataGenerated() }

    var currentPage = mutableStateOf(Pages.ListingPage)
    var currentQuote: Quote? = null

   private fun getDataGenerated() :ArrayList<Quote> {
        return arrayListOf(

            Quote("The only way to do great work is to love what you do.", "Steve Jobs"),
            Quote("The way to get started is to quit talking and begin doing.", "Walt Disney"),
            Quote("Life is what happens when you're busy making other plans.", "John Lennon"),
            Quote("Success is not the key to happiness. Happiness is the key to success.", "Albert Schweitzer"),
            Quote("In the end, we will remember not the words of our enemies, but the silence of our friends.", "Martin Luther King Jr."),
            Quote("I'm not arguing, I'm just explaining why I'm right.", "Unknown"),
            Quote("Courage is not the absence of fear, but the triumph over it.", "Nelson Mandela"),
            Quote("The future belongs to those who believe in the beauty of their dreams.", "Eleanor Roosevelt"),
            Quote("An investment in knowledge pays the best interest.", "Benjamin Franklin"),
            Quote("The only limit to our realization of tomorrow is our doubts of today.", "Franklin D. Roosevelt"),
            Quote("The best time to plant a tree was 20 years ago. The second best time is now.", "Chinese Proverb"),
            Quote("It does not matter how slowly you go as long as you do not stop.", "Confucius"),
            Quote("Everything you’ve ever wanted is on the other side of fear.", "George Addair"),
            Quote("You miss 100% of the shots you don’t take.", "Wayne Gretzky"),
            Quote("Whether you think you can or you think you can’t, you’re right.", "Henry Ford"),
            Quote("I have learned over the years that when one's mind is made up, this diminishes fear.", "Rosa Parks"),
            Quote("I alone cannot change the world, but I can cast a stone across the water to create many ripples.", "Mother Teresa"),
            Quote("What we achieve inwardly will change outer reality.", "Plutarch"),
            Quote("Act as if what you do makes a difference. It does.", "William James"),
            Quote("Success usually comes to those who are too busy to be looking for it.", "Henry David Thoreau"),
            Quote("Do not wait to strike till the iron is hot; but make it hot by striking.", "William Butler Yeats"),
            Quote("Great minds discuss ideas; average minds discuss events; small minds discuss people.", "Eleanor Roosevelt"),
            Quote("Those who dare to fail miserably can achieve greatly.", "John F. Kennedy"),
            Quote("The only place where success comes before work is in the dictionary.", "Vidal Sassoon"),
            Quote("If you set your goals ridiculously high and it’s a failure, you will fail above everyone else’s success.", "James Cameron")
        )
    }

     fun switchPages (quote: Quote?) {
        if (currentPage.value == Pages.ListingPage) {
            currentQuote = quote
            currentPage.value = Pages.DetailsPage
        }
        else {
            currentPage.value = Pages.ListingPage
        }

    }


    enum class Pages {
        ListingPage,
        DetailsPage
    }

}