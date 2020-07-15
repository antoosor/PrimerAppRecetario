package com.example.cocinaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        adaptador = AdaptadorCustom(this,platoFuerte)
        lista?.adapter = adaptador

    }
}
