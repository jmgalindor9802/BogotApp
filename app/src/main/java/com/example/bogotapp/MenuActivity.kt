package com.example.bogotapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MenuActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initRecyclerView()

    }

    fun initRecyclerView(){
     val recyclerView=findViewById<RecyclerView>(R.id.recycler)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=SitioAdapter(SitioProvider.SitiosList)
    }
}