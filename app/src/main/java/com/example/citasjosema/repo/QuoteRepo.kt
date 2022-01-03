package com.example.citasjosema.repo

import com.example.citasjosema.model.QuoteModel
import kotlin.random.Random

class QuoteRepo {

    fun getQuoteModel(): QuoteModel? {

        val quoteMap = mapOf(

            1 to QuoteModel(
                "Todos los días cantan los pajarillos",
                "Josema"
            ),

            2 to QuoteModel(
                "Tengo que limpiar los cristales de la ventana",
                "Yo mismo"
            ),

            3 to QuoteModel(
                "¿El vecino siempre está de obras?",
                "Otra mía"
            ),

            4 to QuoteModel(
                "Esta noche ha hecho mucho frío",
                "La planta de las flores rojas"
            ),

            ).withDefault { QuoteModel("", "") }
        return quoteMap[Random.nextInt(1, quoteMap.size + 1)]
    }

}