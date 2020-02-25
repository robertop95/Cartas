package com.robertopa.cartas.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.robertopa.cartas.R


class HomeFragment : Fragment() {
    private lateinit var _view: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        _view =  inflater.inflate(R.layout.fragment_home, container, false)
        return _view
    }


}
