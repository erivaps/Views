package com.kotlin.views.views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nombres:Array<String> = arrayOf("Sting", "Christian", "Jose",
                "Davis", "Eslis", "Erison", "GianCarlo","Miguel")

        var nombreAdapter = ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,nombres)

        lstNombres.adapter = nombreAdapter
    }
}
