package com.example.bogotapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class SitioViewHolder(val view:View):ViewHolder(view) {

    val imageSitio=view.findViewById<ImageView>(R.id.imageSitio)
    val nombreSitio=view.findViewById<TextView>(R.id.nombreSitio)
    val contenidoSitio=view.findViewById<TextView>(R.id.contenidoSitio)
    fun render(sitioModel: Sitio){
        nombreSitio.text=sitioModel.nombre
        contenidoSitio.text=sitioModel.desc
        Glide.with(imageSitio.context).load(sitioModel.foto).into(imageSitio)
    }
}