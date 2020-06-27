package com.example.cocinaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class IndiceDeSopas : AppCompatActivity() {

    var arregloSopas = arrayOf("Sopa Aguada", "Sopa de Tortilla", "Caldo de Pollo","Caldo de res","Arroz  blanco","Arroz rojo","Arroz verde","Arroz chino","Crema champiñones","Crema de queso","Crema de Zanahoria","Crema de chile  Poblano")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indice_de_sopas)

        val adapter = ArrayAdapter (this,R.layout.item_sopas,arregloSopas)
        val listView =  findViewById<ListView>(R.id.ListView)
        listView.adapter = adapter

        listView.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (position == 0){
                    val paseAsopaAguada = Intent(
                        this@IndiceDeSopas,RecetaSopaAguada::class.java)
                        startActivity(paseAsopaAguada)

                }
                if (position == 1){
                    val paseASopadeTortilla = Intent(
                        this@IndiceDeSopas,RecetaSopaTortilla::class.java)
                        startActivity(paseASopadeTortilla)

                }
                if  (position == 2){
                    val paseCaldoPollo = Intent(
                    this@IndiceDeSopas,RecetaCaldoPollo::class.java)
                    startActivity(paseCaldoPollo)
                }

                if  (position == 3){
                    val paseCaldodeRes = Intent(
                    this@IndiceDeSopas,RecetaCaldoRes::class.java)
                    startActivity(paseCaldodeRes)

                }
            }

        }
    }
}
