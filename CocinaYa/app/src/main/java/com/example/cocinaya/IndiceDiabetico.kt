package com.example.cocinaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class IndiceDiabetico : AppCompatActivity() {

    var lista: RecyclerView? = null
    var adaptador:AdaptadorCustom?= null
    var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indice_diabetico)
        val diabetico = ArrayList<Entrada>()

        diabetico.add(Entrada("Barras de Granola", 25.00 , 3.5f,R.drawable.barrasgranola))
        diabetico.add(Entrada("Ceviche de Soya", 30.00, 4.0f,R.drawable.cevichesoya))
        diabetico.add(Entrada("Fresas Rellenas de Mascarpone", 50.00, 3.5f,R.drawable.fresasmascarpone))
        diabetico.add(Entrada("Galletas de Manzana", 50.00, 4.3f,R.drawable.galletasmanzana))
        diabetico.add(Entrada("Jitomate Rellenos de Pure de Papa", 50.00, 4.3f,R.drawable.jitomatepurepapa))
        diabetico.add(Entrada("Pollo en Salsa de Avena", 25.00 , 3.5f,R.drawable.pollosalsaavena))



        lista = findViewById(R.id.listaDiabeticos)
        lista?.setHasFixedSize(true)

        layoutManager = LinearLayoutManager(this)
        lista?.layoutManager = layoutManager

        adaptador = AdaptadorCustom(this,diabetico)
        lista?.adapter = adaptador

    }
}
