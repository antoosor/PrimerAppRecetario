package com.example.cocinaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_indice_plato_fuerte.*

class IndicePlatoFuerte : AppCompatActivity() {

    var lista: RecyclerView? = null
    var adaptador: AdaptadorCustom? = null
    var layoutManager: RecyclerView.LayoutManager?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indice_plato_fuerte)

        val platoFuerte =  ArrayList<Entrada>()
        platoFuerte.add(Entrada("Alambre de Pollo", 35.00 , 4.5f,R.drawable.alambredepollo))
        platoFuerte.add(Entrada("Alambre de Puerco", 30.00, 3.7f,R.drawable.alambredepuerco))
        platoFuerte.add(Entrada("Alambre de Res", 35.00, 4.2f,R.drawable.alambrederes))
        platoFuerte.add(Entrada("Albondigas de Res", 45.00, 4.8f,R.drawable.albondigaderes))
        platoFuerte.add(Entrada("Bisteces en Morita", 30.00, 4.6f,R.drawable.bistecenchilemorita))
        platoFuerte.add(Entrada("Burritos de Carne", 25.00 , 3.5f,R.drawable.burritosdecarne))
        platoFuerte.add(Entrada("Chicharrón Salsa Roja", 40.00, 4.2f,R.drawable.chicharronsalsaroja))
        platoFuerte.add(Entrada("Chimichangas", 20.00, 3.5f,R.drawable.chimichangas))
        platoFuerte.add(Entrada("Cochinita Pibil", 60.00, 5.0f,R.drawable.cochinitapibli))
        platoFuerte.add(Entrada("Flautas de Res", 35.00 , 3.9f,R.drawable.flautasderes))


        lista = findViewById(R.id.listaPlatoFuerte)
        lista?.setHasFixedSize(true)

        layoutManager = LinearLayoutManager(this)
        lista?.layoutManager = layoutManager

        adaptador = AdaptadorCustom( platoFuerte, object : ClickListener{
            override fun onClicck(vista: View, index: Int) {
            when(index){

                0 ->  {val pasoAlambredePollo = Intent(
                applicationContext,RecetaAlambredePollo::class.java)
                startActivity(pasoAlambredePollo)}
                1 ->{
                    val pasoAlambredePuerco = Intent(
                        applicationContext,RecetaAlambredePuerco::class.java)
                    startActivity(pasoAlambredePuerco)
                }
                2 ->  {val pasoAlambredeRes = Intent(
                    applicationContext,RecetaAlambredeRes::class.java)
                    startActivity(pasoAlambredeRes)}
                3 ->{
                    val pasoAlbondigadeRes = Intent(
                        applicationContext,RecetaAlbondigadeRes::class.java)
                    startActivity(pasoAlbondigadeRes)
                }
                4 ->  {val pasoBistacMorita = Intent(
                    applicationContext,RecetaBistecesRes::class.java)
                    startActivity(pasoBistacMorita)}
                5 ->{
                    val pasoBurritos = Intent(
                        applicationContext,RecetaBurritosCarne::class.java)
                    startActivity(pasoBurritos)
                }
                6 ->  {val pasoChicharronRoja = Intent(
                    applicationContext,RecetaChicharronRoja::class.java)
                    startActivity(pasoChicharronRoja)}
                7 ->{
                    val pasoChimichanga = Intent(
                        applicationContext,RecetaChimichanga::class.java)
                    startActivity(pasoChimichanga)
                }
                8 ->  {val pasoCochinita = Intent(
                    applicationContext,RecetaCochinita::class.java)
                    startActivity(pasoCochinita)}
                9 ->{
                    val pasoFlautasRes = Intent(
                        applicationContext,RecetaFlautasRes::class.java)
                    startActivity(pasoFlautasRes)
                }





            }

            }
        })
        lista?.adapter = adaptador

    }
}
