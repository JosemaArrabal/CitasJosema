package com.example.citasjosema.ui.main

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.citasjosema.R
import com.example.citasjosema.databinding.FragmentMainBinding
import java.util.*

class MainFragment : Fragment() {

    //Creamos el binding
    private lateinit var binding: FragmentMainBinding

    //Después de crear la clase MainViewModel definimos la siguiente variable
    private val quoteViewModel = MainViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    //Esta línea no tengo ni idea de donde viene
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        quoteViewModel.getQuote()

        //Con esto se hace que toda la pantalla sea un botón
        binding.root.setOnClickListener {
            quoteViewModel.getQuote()
        }

        quoteViewModel.constQuote.observe(viewLifecycleOwner, { quoteModel ->
            quoteModel?.let {
                binding.mainQuote.text=it.quote
                binding.mainQuoteAuthor.text = it.author
            }
        })
    }
}