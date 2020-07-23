package com.saurabh.daggerwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
    @Inject
    lateinit var car1: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var carComponent=(application as ApplicationExample).carComponent()

       /* var carComponent1=DaggerCarComponent.builder()
            .powerCapacity(300)
            .engineCapacity(1000)
            .build()*/
        carComponent.inject(this)
        car.start()
        car1.start()
        /*car=carComponent.getCar()
        car.start()
        car1=carComponent1.getCar()
        car1.start()*/

    }
}