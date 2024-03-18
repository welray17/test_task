package com.example.test.presentation

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R

class CarViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val carName =view.findViewById<TextView>(R.id.car_name)
    val carImage = view.findViewById<ImageView>(R.id.car_image)
    val carYear = view.findViewById<TextView>(R.id.car_year)
}