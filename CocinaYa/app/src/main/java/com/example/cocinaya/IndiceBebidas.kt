package com.example.cocinaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class IndiceBebidas : AppCompatActivity() {

    var lista: RecyclerView? = null
    var adaptador:AdaptadorCustom?= null
    var layoutManager: RecyclerView.LayoutManager? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indice_bebidas)

        val bebida = ArrayList<Entrada>()


        bebida.add(Entrada("Paloma de Granada", 50.00, 4.3f,R.drawable.palomagranada))
        bebida.add(Entrada("Café Espumoso Dalgona", 30.00, 4.0f,R.drawable.cafeespumosodalgona))
        bebida.add(Entrada("Licuado de Mango con Leche de Avena", 50.00, 3.5f,R.drawable.licuadomongo))
        bebida.add(Entrada("Mangonada", 50.00, 4.3f,R.drawable.mangonadas))
        bebida.add(Entrada("Michelada Cubana con Camarones", 50.00, 4.3f,R.drawable.micheladacubanas))
        bebida.add(Entrada("Michelada de Mango con Chamoy", 25.00 , 3.5f,R.drawable.micheladamangochamoy))
        bebida.add(Entrada("Mojito Frappé de Bluberry", 50.00, 4.3f,R.drawable.mojitofrapeblueberry))
        bebida.add(Entrada("Atole de Mazapán", 25.00 , 3.5f,R.drawable.atolemazapan))
        lista = findViewById(R.id.listaBebidas)
        lista?.setHasFixedSize(true)

        layoutManager = LinearLayoutManager(this)
        lista?.layoutManager = layoutManager

        adaptador = AdaptadorCustom( bebida, object : ClickListener{
            override fun onClicck(vista: View, index: Int) {
                when(index){

                    0 ->  {val pasoPalomaGranada = Intent(
                        applicationContext,RecetaPalomaGranada::class.java)
                        startActivity(pasoPalomaGranada)}
                    1 ->{
                        val pasoCafeEspumoso = Intent(
                            applicationContext,RecetaCafeEspumoso::class.java)
                        startActivity(pasoCafeEspumoso)
                    }
                    2 ->  {val pasoLicuadoMangoAvena = Intent(
                        applicationContext,RecetaLicuadoMangoAvena::class.java)
                        startActivity(pasoLicuadoMangoAvena)}
                    3 ->{
                        val pasoMangonada = Intent(
                            applicationContext,RecetaMangonada::class.java)
                        startActivity(pasoMangonada)
                    }
                    4 ->  {val pasoMicheladaCuabana = Intent(
                        applicationContext,RecetaMicheladaCubana::class.java)
                        startActivity(pasoMicheladaCuabana)
                    }
                    5 ->{
                        val pasoMicheladaChamoy = Intent(
                    applicationContext,RecetaMicheladaChamoy::class.java)
                    startActivity(pasoMicheladaChamoy)
                     }
                    6 ->  {val pasoMojitoFrappe = Intent(
                        applicationContext,RecetaMojitoFrappe::class.java)
                        startActivity(pasoMojitoFrappe)
                    }
                    7 ->{
                        val pasoAtoleMazapan = Intent(
                            applicationContext,RecetaAtoleMazapan::class.java)
                        startActivity(pasoAtoleMazapan)
                    }

                }
            }
        })
        lista?.adapter = adaptador





    }
}
