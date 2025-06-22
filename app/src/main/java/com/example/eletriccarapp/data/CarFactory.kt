package com.example.eletriccarapp.data

import com.example.eletriccarapp.domain.Carro

object CarFactory {

    val list = listOf<Carro>(
        Carro(
            id = 1,
            preco = "300.000,00",
            bateria = "300 kWh",
            potencia = "200cv",
            recarga = "30 min",
            urlPhoto = "www.google.com"
        ),

                Carro(
                id = 2,
        preco = "200.000,00",
        bateria = "150 kWh",
        potencia = "100cv",
        recarga = "45 min",
        urlPhoto = "www.google.com"
    )





    )

}