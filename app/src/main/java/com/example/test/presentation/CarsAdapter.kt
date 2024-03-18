package com.example.test.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.domain.Car

class CarsAdapter(val dataList: List<Car>): RecyclerView.Adapter<CarViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val layout = R.layout.car_item
        val view =LayoutInflater.from(parent.context).inflate(layout, parent, false)
        return CarViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val current = dataList[position]
        holder.carName.text = current.carName
        holder.carYear.text = current.carYear.toString()
        holder.carImage.setImageResource(current.carImageId)
    }
}