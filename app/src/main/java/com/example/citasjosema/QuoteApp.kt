package com.example.citasjosema

import android.app.Application
import com.example.citasjosema.di.appModule
import com.example.citasjosema.di.providerModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class QuoteApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@QuoteApp)
            modules(appModule, providerModule)
        }
    }

}