package com.robertopa.cartas

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    companion object {
        const val BASE_URL = "http://localhost:8080/Cartas/rest/"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAcceder.setOnClickListener { AccederUsuario() }
        buttonCrearUser.setOnClickListener {
            val intent = Intent(this, RegistrarJugadorActivity::class.java)
            startActivity(intent)
        }
    }

    private fun AccederUsuario() {
        val user = TVUsuario.text.toString()
        val pass = TVPass.text.toString()
        var ValidoUser: Boolean
        var ValidoPass: Boolean
        /*val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service = retrofit.create(APIService::class.java)
        val call = service.loginUser(user, pass)*/

        if (!esValidoNom(user)) {
            TIUsuario.error = "Usuario no valido, vuelve a intentarlo"
            ValidoUser = false
        } else {
            TIUsuario.error = null
            ValidoUser = true
        }

        if (!esValidoPass(pass)) {
            TIPassword.error = "Contraseña no valida, vuelve a intentarlo"
            ValidoPass = false
        } else {
            TIPassword.error = null
            ValidoPass = true
        }

        if(ValidoUser && ValidoPass) {
            val intent = Intent(this, MenuActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }

    /*private fun AccederUsuario() {
        val user = TVUsuario.text.toString()
        val pass = TVPass.text.toString()
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service = retrofit.create(APIService::class.java)
        val call = service.loginUser(user, pass)

        if (esValidoNom(user) && esValidoPass(pass)) {
            call.enqueue(object: Callback<Jugador> {
                override fun onFailure(call: Call<Jugador>, t: Throwable) {
                    Toast.makeText(applicationContext, "Datos incorrectos, vuelve a intentarlo.",
                        Toast.LENGTH_LONG).show()
                }

                override fun onResponse(call: Call<Jugador>,
                                        response: Response<Jugador>) {

                    if (response.isSuccessful) {
                        /*val intent = Intent(applicationContext, MenuActivity::class.java)
                        startActivity(intent)*/
                        Toast.makeText(applicationContext, "Datos correctos",
                            Toast.LENGTH_LONG).show()
                    }
                }

            })
        }
    }*/

    fun esValidoNom(nom: String): Boolean {
        var nick = "Sara"
        return nom.isNotEmpty() && nom == nick
    }

    fun esValidoPass(pass: String): Boolean {
        var password = "1234"
        return pass.isNotEmpty() && pass == password
    }
}