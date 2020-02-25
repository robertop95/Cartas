package com.robertopa.mylibrary

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.robertopa.mylibrary.interfaces.IToolbar

open class ToolbarActivity : AppCompatActivity(), IToolbar {

    protected var _toolbar: Toolbar? = null

    override fun toolbarLoad(toolbar: Toolbar?) {
        _toolbar = toolbar
        // Dejar sin titulo
        _toolbar?.title = ""
        _toolbar?.let { setSupportActionBar(_toolbar) }
    }

    override fun enableHomeDisplay(value: Boolean) {
        supportActionBar?.setDisplayHomeAsUpEnabled(value)
        // Dejar el toobar transparente
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }
}