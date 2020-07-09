package com.example.cocinaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnInicar.setOnClickListener {
            val pasarDatos = Intent (this,ActivityComencemos::class.java)
            pasarDatos.putExtra("pasarNombre", edNombreUsuario.text.toString())
            startActivity(pasarDatos)
        }
    }
}
