package com.example.test.domain

import androidx.annotation.DrawableRes

data class Car(
    @DrawableRes val carImageId: Int,
    val carName: String,
    val carYear: Int
)
