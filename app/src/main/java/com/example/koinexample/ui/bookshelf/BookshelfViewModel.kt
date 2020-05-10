package com.example.koinexample.ui.bookshelf

import androidx.lifecycle.ViewModel
import com.example.koinexample.data.bookshelf.BookshelfUser

class BookshelfViewModel(
    private val firstUser: BookshelfUser,
    private val secondUser: BookshelfUser
) : ViewModel() {

    fun onReadBookButtonPressed() {
        firstUser.readBook()
        firstUser.readBook()
        secondUser.readBook()
    }
}