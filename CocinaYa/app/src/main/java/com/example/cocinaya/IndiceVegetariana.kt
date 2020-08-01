package com.example.cocinaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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

        adaptador = AdaptadorCustom( vegetarianas, object : ClickListener{
            override fun onClicck(vista: View, index: Int) {
                when(index){

                    0 ->  {val pasoAlbondigasBerenjena = Intent(
                        applicationContext,RecetaAlbondigasBerenjena::class.java)
                        startActivity(pasoAlbondigasBerenjena)}
                    1 ->{
                        val pasoCevicheColiflor = Intent(
                            applicationContext,RecetaCevicheColiflor::class.java)
                        startActivity(pasoCevicheColiflor)
                    }
                    2 ->  {val pasoCrepasGarvanzo = Intent(
                        applicationContext,RecetaCrepaGarvanzo::class.java)
                        startActivity(pasoCrepasGarvanzo)}
                    3 ->{
                        val pasoFideosCalabaza = Intent(
                            applicationContext,RecetaFideosCalabaza::class.java)
                        startActivity(pasoFideosCalabaza)
                    }
                    4 ->  {val pasoFlautasCalabaza = Intent(
                        applicationContext,RecetaFlautasCalabaza::class.java)
                        startActivity(pasoFlautasCalabaza)}
                    5 ->{
                        val pasoGorditasFrijol = Intent(
                            applicationContext,RecetaGorditaFrijol::class.java)
                        startActivity(pasoGorditasFrijol)
                    }
                    6 ->  {val pasoHamburguesaPortobello= Intent(
                        applicationContext,RecetaHamburguesaPortobello::class.java)
                        startActivity(pasoHamburguesaPortobello)}
                    7 ->{
                        val pasoPizzaVegetariana = Intent(
                            applicationContext,RecetaPizzaVegetariana::class.java)
                        startActivity(pasoPizzaVegetariana)
                    }
                    8 ->  {val pasoPozoleSetas = Intent(
                        applicationContext,RecetaPozoleSetas::class.java)
                        startActivity(pasoPozoleSetas)}
                    9 ->{
                        val pasoTacosVegetarianos = Intent(
                            applicationContext,RecetaTacosVegetarianos::class.java)
                        startActivity(pasoTacosVegetarianos)
                    }





                }





            }
        })
        lista?.adapter = adaptador

    }
}
