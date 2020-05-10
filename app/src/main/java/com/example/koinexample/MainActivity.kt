package com.example.koinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.koinexample.ui.bookshelf.BookshelfFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, BookshelfFragment.newInstance())
                    .commitNow()
        }
    }
}
