package com.example.koinexample

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initializeKoin()
    }

    private fun initializeKoin() =
        startKoin {
            androidContext(this@BaseApplication)
            modules(bookshelfModule, viewModelModule)
        }
}