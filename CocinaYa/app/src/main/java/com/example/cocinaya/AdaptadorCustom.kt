package com.example.cocinaya

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorCustom(var contexto:Context,items:ArrayList<Entrada>): RecyclerView.Adapter<AdaptadorCustom.ViewHolder>() {

    var items: ArrayList<Entrada>? =  null
    init {
        this.items = items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdaptadorCustom.ViewHolder {
        val vista =  LayoutInflater.from(contexto).inflate(R.layout.item_sopas, parent,false)
        val viewHolder =  ViewHolder(vista)

        return viewHolder
    }

    override fun getItemCount(): Int {
        return items?.count()!!
    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {

        val item = items?.get(position)
        holder.foto?.setImageResource(item?.foto!!)
        holder.nombre?.text= item?.nombre
        holder.tiempoPreparacion?.text = item?.tiempoPreparacion.toString() + " min"
        holder.calificacion?.rating= item?.calificacion!!

    }

    class ViewHolder(vista:View): RecyclerView.ViewHolder(vista){
        var vista = vista
        var foto:  ImageView? = null
        var nombre:  TextView? = null
        var tiempoPreparacion: TextView? = null
        var calificacion: RatingBar? = null

        init {
            foto =  vista.findViewById(R.id.ivFoto)
            nombre=  vista.findViewById(R.id.tvNombre)
            calificacion =  vista.findViewById(R.id.rbCalificacion)
            tiempoPreparacion = vista.findViewById(R.id.tvTiempoPreparacion)
        }

    }

}