package com.kotlin.views.views

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nombres:Array<String> = arrayOf("Sting", "Christian", "Jose",
                "Davis", "Eslis", "Erison", "GianCarlo","Miguel","Wildor")

        var nombreAdapter = ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,nombres)

        lstNombres.adapter = nombreAdapter
    }

    fun verDetalle(view: View){
        var myIntent = Intent(this,RecyclerActivity::class.java)
        //myIntent.putExtra("nombre", lstNombres.selectedItem)
        startActivity(myIntent)

    }
}
