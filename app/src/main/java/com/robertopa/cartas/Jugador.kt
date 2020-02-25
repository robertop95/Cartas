package com.robertopa.cartas

import com.google.gson.annotations.SerializedName

data class Jugador(@SerializedName("idJugador") var idJugador: Int,
                   @SerializedName("nombre") var nombre: String,
                   @SerializedName("password") var password: String,
                   @SerializedName("PGanadas") var PGanadas: Int,
                   @SerializedName("PPerdidas") var PPerdidas: Int,
                   @SerializedName("PEmpatadas") var PEmpatadas: Int,
                   @SerializedName("PJugadas") var PJugadas: Int)