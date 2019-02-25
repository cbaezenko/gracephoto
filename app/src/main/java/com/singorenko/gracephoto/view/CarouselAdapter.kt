package com.singorenko.gracephoto.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.singorenko.gracephoto.R

class CarouselAdapter (val items: ArrayList<String>, val context: Context) : RecyclerView.Adapter<CarouselViewHolder>(){
    override fun onBindViewHolder(holder: CarouselViewHolder, position: Int) {
    }

    override fun getItemCount(): Int { return 8 }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {
       return CarouselViewHolder(LayoutInflater.from(context).inflate(R.layout.carousel_item, parent, false))
    }

}

class CarouselViewHolder (view: View) : RecyclerView.ViewHolder(view){

}