package com.robertopa.cartas.fragments


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.robertopa.cartas.MainActivity
import com.robertopa.cartas.R
import kotlinx.android.synthetic.main.fragment_perfil.view.*

class PerfilFragment : Fragment() {
    private lateinit var _view: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        _view = inflater.inflate(R.layout.fragment_perfil, container, false)

        _view.buttonSalir.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
        return _view
    }
}
