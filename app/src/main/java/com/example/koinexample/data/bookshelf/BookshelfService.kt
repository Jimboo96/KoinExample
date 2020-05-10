package com.example.koinexample.data.bookshelf

import android.util.Log

class BookshelfService {

    private val books = mutableListOf(
        Book("Book1", "Book Writer", 100),
        Book("Book2", "Book Writer", 200),
        Book("Book3", "Book Writer", 300)
    )

    fun borrowBook(): Book? {
        if (books.size > 0) {
            books[0].let { bookToBorrow ->
                books.removeAt(0)
                return bookToBorrow
            }
        } else {
            return null
        }
    }

    fun injectionTest() {
        Log.d("KoinTest", "This is an injection test.")
    }
}