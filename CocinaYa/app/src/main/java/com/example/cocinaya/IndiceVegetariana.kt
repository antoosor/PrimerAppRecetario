package com.example.cocinaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class IndiceVegetariana : AppCompatActivity() {

    var lista: RecyclerView? = null
    var adaptador:AdaptadorCustom?= null
    var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indice_vegetariana)

        val vegetarianas = ArrayList<Entrada>()
        vegetarianas.add(Entrada("Albondigas de Berenjena", 25.00 , 3.5f,R.drawable.albondigasberenjena))
        vegetarianas.add(Entrada("Ceviche de Coliflor", 30.00, 4.0f,R.drawable.cevichecoliflor))
        vegetarianas.add(Entrada("Crepas de Garbanzo", 50.00, 3.5f,R.drawable.crepagarbanzo))
        vegetarianas.add(Entrada("Fideos de Calabaza", 50.00, 4.3f,R.drawable.fideosdecalabaza))
        vegetarianas.add(Entrada("Flautas de Calabaza", 50.00, 4.3f,R.drawable.flautascalabazas))
        vegetarianas.add(Entrada("Gorditas de Frijol", 25.00 , 3.5f,R.drawable.gorditafrijol))
        vegetarianas.add(Entrada("Hamburguesa Portobello", 30.00, 4.0f,R.drawable.hamburguesaportobello))
        vegetarianas.add(Entrada("Pizza Vegetariana", 50.00, 3.5f,R.drawable.pizzavegetariana))
        vegetarianas.add(Entrada("Pozole de Setas", 50.00, 4.3f,R.drawable.pozolesetas))
        vegetarianas.add(Entrada("Tacos Vegetarianos", 50.00, 4.3f,R.drawable.tacoscalabaza))


        lista = findViewById(R.id.listavegetariana)
        lista?.setHasFixedSize(true)

        layoutManager = LinearLayoutManager(this)
        lista?.layoutManager = layoutManager

        adaptador = AdaptadorCustom(this,vegetarianas)
        lista?.adapter = adaptador

    }
}
