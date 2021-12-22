package com.example.citasjosema.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.citasjosema.model.QuoteModel
import com.example.citasjosema.repo.QuoteRepo

class MainViewModel : ViewModel() {

    private val quoteRepo = QuoteRepo()

    private val _constQuoteModel = MutableLiveData <QuoteModel?>()
    val constQuote: LiveData<QuoteModel?> = _constQuoteModel

    fun getQuote(){
        _constQuoteModel.value = quoteRepo.getQuoteModel()
    }

}