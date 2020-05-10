package com.example.koinexample.data.bookshelf

import android.util.Log

class Book(private val bookName: String,
           private val author: String,
           private val numberOfPages: Int) {

    fun getBookInfo() {
        Log.d("KoinTest","Reading $bookName by $author. The book has $numberOfPages pages.")
    }
}