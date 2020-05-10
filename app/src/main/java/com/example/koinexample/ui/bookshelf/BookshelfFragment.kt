package com.example.koinexample.ui.bookshelf

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.koinexample.R
import com.example.koinexample.data.bookshelf.BookshelfService
import kotlinx.android.synthetic.main.main_fragment.*
import org.koin.android.ext.android.get
import org.koin.android.viewmodel.ext.android.viewModel

class BookshelfFragment : Fragment() {

    companion object {
        fun newInstance() = BookshelfFragment()
    }

    // Lazy injection of the ViewModel.
    private val viewModel : BookshelfViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        read_book_button.setOnClickListener {
            viewModel.onReadBookButtonPressed()
        }

        // Directly getting an instance of a service.
        val bookshelfService: BookshelfService = get()
        bookshelfService.injectionTest()
    }
}