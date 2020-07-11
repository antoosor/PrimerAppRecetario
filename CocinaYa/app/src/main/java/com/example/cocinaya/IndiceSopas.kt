package com.example.cocinaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class IndiceSopas : AppCompatActivity() {

    var lista: RecyclerView? = null
    var adaptador:AdaptadorCustom?= null
    var layoutManager: RecyclerView.LayoutManager? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indice_sopas)

        val entradas = ArrayList<Entrada>()
        entradas.add(Entrada("Sopa Aguada", 25.00 , 3.5f,R.drawable.sopaaguada))
        entradas.add(Entrada("Sopa de Tortilla", 30.00, 4.0f,R.drawable.sopadetortilla))
        entradas.add(Entrada("Caldo de Pollo", 50.00, 3.5f,R.drawable.caldodepollo))
        entradas.add(Entrada("Caldo de Res", 50.00, 4.3f,R.drawable.caldoderes))
        entradas.add(Entrada("Arroz Blanco", 50.00, 4.3f,R.drawable.arrozblanco))
        entradas.add(Entrada("Arroz Rojo", 25.00 , 3.5f,R.drawable.arrozrojo))
        entradas.add(Entrada("Arroz Verde", 30.00, 4.0f,R.drawable.arrrozverde))
        entradas.add(Entrada("Crema de Champiñones", 50.00, 3.5f,R.drawable.cremadechampinones))
        entradas.add(Entrada("Crema de Queso", 50.00, 4.3f,R.drawable.cremadequeso))
        entradas.add(Entrada("Espagueti con Crema y Queso", 50.00, 4.3f,R.drawable.espaguetticoncremadequeso))

        lista = findViewById(R.id.lista)
        lista?.setHasFixedSize(true)

        layoutManager = LinearLayoutManager(this)
        lista?.layoutManager = layoutManager

        adaptador = AdaptadorCustom(this,entradas)
        lista?.adapter = adaptador



    }
}
