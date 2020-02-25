package com.robertopa.cartas

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.robertopa.mylibrary.ToolbarActivity
import kotlinx.android.synthetic.main.activity_registrar_jugador.*

class RegistrarJugadorActivity : ToolbarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar_jugador)

        toolbarLoad(toolbar as Toolbar)
        enableHomeDisplay(true)

        buttonCrear.setOnClickListener { crearJugador() }
    }

    private fun crearJugador() {
        val nomJugador = TVNewUsuario.text.toString()
        val passJugador = TVNewPass.text.toString()

        if (nomJugador.isNotEmpty() && passJugador.isNotEmpty()) {
            Toast.makeText(this, "Jugador creado", Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            //overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        } else Toast.makeText(this, "Por favor, rellena los datos",
            Toast.LENGTH_LONG).show()
    }
}
