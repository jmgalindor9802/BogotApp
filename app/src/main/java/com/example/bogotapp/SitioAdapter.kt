package com.example.bogotapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SitioAdapter(private val SitioList:List<Sitio>):RecyclerView.Adapter<SitioViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SitioViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return SitioViewHolder(layoutInflater.inflate(R.layout.item_sitio,parent,false))

    }

    override fun getItemCount(): Int = SitioList.size

    override fun onBindViewHolder(holder: SitioViewHolder, position: Int) {

        val item=SitioList[position]
        holder.render(item)

    }

}