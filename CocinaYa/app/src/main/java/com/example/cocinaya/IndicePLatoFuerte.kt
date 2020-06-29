package com.example.cocinaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_indice_p_lato_fuerte.*
import java.util.*

class IndicePLatoFuerte : AppCompatActivity() {

    val arregloGuisados = arrayOf("Alambre de pollo","Alambre de res", "Alambre de puerco", "Albondiga  de res", "Albondiga de pollo", "Bistec de res en Salsa verda", "Bistec de res en Salsa de Morita")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indice_p_lato_fuerte)

        val adapter = ArrayAdapter(this,R.layout.item_platofuerte,arregloGuisados)
        val listView = findViewById <ListView>(R.id.ListViewGuisado)
        listView.adapter = adapter

        listView.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if  (position == 0){
                    val paseAlambredePollo = Intent (
                        this@IndicePLatoFuerte,RecetaAlambredePollo::class.java)
                         startActivity(paseAlambredePollo)
                }

                if (position == 1){
                    val paeAlembredeREs = Intent(
                        this@IndicePLatoFuerte, RecetaAlambredeRes::class.java)
                         startActivity(paeAlembredeREs)

                }

                if (position == 2){
                    val paseAlambredePuerco = Intent(
                        this@IndicePLatoFuerte,RecetaAlambredePuerco::class.java)
                        startActivity(paseAlambredePuerco)

                }
                if (position == 3){
                    val paeAlembredeREs = Intent(
                        this@IndicePLatoFuerte, RecetaAlbondigadeRes::class.java)
                    startActivity(paeAlembredeREs)

                }

            }


        }


    }


}
