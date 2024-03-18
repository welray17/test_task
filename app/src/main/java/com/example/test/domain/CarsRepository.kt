package com.example.test.domain

interface CarsRepository {
    fun getCarsList(): List<Car>
}