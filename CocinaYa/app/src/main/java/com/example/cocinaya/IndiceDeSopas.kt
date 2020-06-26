package com.example.cocinaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class IndiceDeSopas : AppCompatActivity() {

    var arregloSopas = arrayOf("Sopa Aguada", "Sopa de Tortilla", "Caldo de Pollo","Caldo de res")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indice_de_sopas)

        val adapter = ArrayAdapter (this,R.layout.itemsopa,arregloSopas)
        val listView =  findViewById<ListView>(R.id.ListView)
        listView.adapter = adapter
    }
}
