package com.example.koinexample

import com.example.koinexample.data.bookshelf.BookshelfService
import com.example.koinexample.data.bookshelf.BookshelfUser
import com.example.koinexample.ui.bookshelf.BookshelfViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val bookshelfModule = module {
    // Defines a singleton of BookshelfService-class.
    single { BookshelfService() }

    // Creates a new instance every time of the BookshelfUser-class.
    factory { BookshelfUser(get()) }
}

val viewModelModule = module {
    // Declares a ViewModel by using the viewModel keyword.
    viewModel { BookshelfViewModel(get(), get()) }
}