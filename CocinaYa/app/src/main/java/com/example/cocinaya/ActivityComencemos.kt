package com.example.cocinaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_comencemos.*

class ActivityComencemos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comencemos)

        var nombre:String?
        nombre = intent.getStringExtra("pasarNombre")
        tvNombreRecibido.setText("Te damos la Bienvenida " + nombre)

        imageButtonSopa.setOnClickListener {
            val indicesopas = Intent(this,IndiceSopas::class.java)
            startActivity(indicesopas)
        }
        btnPlatoFuerte.setOnClickListener {
           val indiceplatoFuerte = Intent(this,IndicePlatoFuerte::class.java)
           startActivity(indiceplatoFuerte)
        }
        btnRapido.setOnClickListener {
           val indiceComidaRapida = Intent(this,IndiceVegetariana::class.java)
           startActivity(indiceComidaRapida)
        }

       btnBebidas.setOnClickListener {
            val indiceBebidas= Intent(this, IndiceBebidas::class.java)
            startActivity(indiceBebidas)
        }

        btnDiabeticos.setOnClickListener {
            val indicePlatoFuerte = Intent(this,IndiceDiabetico::class.java)
            startActivity(indicePlatoFuerte)
        }

    }




}


