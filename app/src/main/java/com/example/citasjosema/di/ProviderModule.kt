package com.example.citasjosema.di

import com.example.citasjosema.repo.QuoteRepo
import org.koin.dsl.module

val providerModule = module {
    single { QuoteRepo() }
}