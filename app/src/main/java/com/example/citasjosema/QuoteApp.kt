package com.example.citasjosema

import android.app.Application
import com.example.citasjosema.di.appModule
import com.example.citasjosema.di.providerModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

// QuoteApp va a ser el nombre de la app que se indicará en el AndroidManifest
// Se crea el método sobreescrito onCreate y se inicializa Koin
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