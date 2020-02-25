package com.robertopa.cartas

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface APIService {

    @POST("/login/user")
    @FormUrlEncoded
    fun loginUser(@Field("nombre") nom: String,
                  @Field("password") pw: String): Call<Jugador>

    @POST("/login/registro")
    @FormUrlEncoded
    fun createUser(@Field("nombre") nom: String,
                   @Field("password") pw: String): Call<Jugador>
}