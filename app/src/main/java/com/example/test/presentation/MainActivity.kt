package com.example.test.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.data.CarsRepository
import com.example.test.domain.Car
import com.example.test.ui.theme.TestTheme

class MainActivity : ComponentActivity() {

    private lateinit var carsListAdapter: CarsAdapter
    private lateinit var carsList: List<Car>
    private val carsRepository = CarsRepository()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.setContentView(R.layout.activity_main)
        carsList = carsRepository.getCarsList()
        setupRecyclerView()
    }
    fun setupRecyclerView() {
        val carsRV = findViewById<RecyclerView>(R.id.rv_cars)
        with(carsRV){
            carsListAdapter = CarsAdapter(carsList)
            adapter = carsListAdapter
        }
    }
}

