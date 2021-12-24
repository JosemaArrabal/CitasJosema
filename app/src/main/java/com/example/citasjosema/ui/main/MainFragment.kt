package com.example.citasjosema.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.citasjosema.databinding.FragmentMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private val quoteViewModel: MainViewModel by viewModel()

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
                binding.mainQuote.text = it.quote
                binding.mainQuoteAuthor.text = it.author
            }
        })
    }
}