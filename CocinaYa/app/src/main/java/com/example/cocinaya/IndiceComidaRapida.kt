package com.example.cocinaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class IndiceComidaRapida : AppCompatActivity() {

    val arregloComidaRapida = arrayOf("Sincronizada", "Sandwich Montecristo", "Hot - Dog ", "Hamburguesa", "Pizza", "Nuggets de pollo")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indice_comida_rapida)

        val adapter = ArrayAdapter (this,R.layout.item_sopas,arregloComidaRapida)
        val listView =  findViewById<ListView>(R.id.ListViewComidaRApida)
        listView.adapter = adapter

        listView.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {

                if (position == 0) {
                    val paseSIncronizada = Intent(
                    this@IndiceComidaRapida,RecetaSincronizada::class.java)
                    startActivity(paseSIncronizada)
                }
            }


        }


    }
}
