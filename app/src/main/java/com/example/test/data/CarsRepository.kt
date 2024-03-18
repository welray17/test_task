package com.example.test.data

import com.example.test.R
import com.example.test.domain.Car
import com.example.test.domain.CarsRepository

class CarsRepository: CarsRepository {
    private lateinit var carsList: List<Car>
    override fun getCarsList(): List<Car> {
        carsList = listOf(
            Car(R.drawable.img, "Car1", 2000),
            Car(R.drawable.img, "Car2", 2001),
            Car(R.drawable.img, "Car3", 2002)
        )
        return carsList
    }
}