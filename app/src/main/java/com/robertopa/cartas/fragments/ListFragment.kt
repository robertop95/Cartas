package com.robertopa.cartas.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.robertopa.cartas.R
import kotlinx.android.synthetic.main.fragment_list.view.*


class ListFragment : Fragment() {
    private lateinit var _view: View
    var array = arrayOf("Jugador 1", "Jugador 2", "Jugador 3", "Jugador 4", "Jugador 5")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        _view = inflater.inflate(R.layout.fragment_list, container, false)
        val adapter = ArrayAdapter(context!!, android.R.layout.simple_list_item_1, array)
        _view.listview.adapter = adapter
        return _view
    }
}
