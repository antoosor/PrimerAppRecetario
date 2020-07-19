package com.example.cocinaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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

        adaptador = AdaptadorCustom( entradas, object : ClickListener{
            override fun onClicck(vista: View, index: Int) {

                when(index){

                    0 ->  {val pasoSopaAguada = Intent(
                    applicationContext,RecetaSopaAguada::class.java)
                    startActivity(pasoSopaAguada)}
                    1 ->{
                        val pasoSopaTortilla = Intent(
                            applicationContext,RecetaSopaTortilla::class.java)
                        startActivity(pasoSopaTortilla)
                    }
                    2 ->  {val pasoCaldoPollo = Intent(
                        applicationContext,RecetaCaldoPollo::class.java)
                        startActivity(pasoCaldoPollo)}
                    3 ->{
                        val pasoCaldoRes = Intent(
                            applicationContext,RecetaCaldoRes::class.java)
                        startActivity(pasoCaldoRes)
                    }
                    4 ->  {val pasoArrozBlanco = Intent(
                        applicationContext,RecetaArrozBlanco::class.java)
                        startActivity(pasoArrozBlanco)}
                    5 ->{
                        val pasoArrozRojo = Intent(
                            applicationContext,RecetaArrozRojo::class.java)
                        startActivity(pasoArrozRojo)
                    }
                    6 ->{
                        val pasoArrozVerde = Intent(
                            applicationContext,RecetaArrozVerde::class.java)
                        startActivity(pasoArrozVerde)
                    }
                    7 ->  {val pasoCremaChampinion= Intent(
                        applicationContext,RecetaCremaChampinion::class.java)
                        startActivity(pasoCremaChampinion)}
                    8 ->{
                        val pasoCremaQueso = Intent(
                            applicationContext,RecetaCremaQuesos::class.java)
                        startActivity(pasoCremaQueso)
                    }
                    9 ->  {val pasoEspaguetiCremaQueso = Intent(
                        applicationContext,RecetaEspaguetiCremaQueso::class.java)
                        startActivity(pasoEspaguetiCremaQueso)}

                }


            }


        })
        lista?.adapter = adaptador



    }
}
