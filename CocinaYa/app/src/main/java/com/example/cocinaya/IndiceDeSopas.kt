package com.example.cocinaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class IndiceDeSopas : AppCompatActivity() {

    var arregloSopas = arrayOf("Sopa Aguada", "Sopa de Tortilla", "Caldo de Pollo","Caldo de res","Arroz  blanco","Arroz rojo","Arroz verde","Arroz chino","Crema champiñones","Crema de queso","Crema de Zanahoria","Crema de chile  Poblano")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indice_de_sopas)

        val adapter = ArrayAdapter (this,R.layout.item_sopas,arregloSopas)
        val listView =  findViewById<ListView>(R.id.ListView)
        listView.adapter = adapter
    }
}
