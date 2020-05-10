package com.example.koinexample.data.bookshelf

import android.util.Log

class BookshelfUser(private val service: BookshelfService) {

    fun readBook() {
        val bookToRead = service.borrowBook()
        if(bookToRead != null) {
            bookToRead.getBookInfo()
        } else {
            Log.d("KoinTest", "Ran out of books to read!")
        }
    }
}