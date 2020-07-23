package com.saurabh.daggerwithkotlin

import android.app.Application

class ApplicationExample : Application() {

    lateinit var carComponent: CarComponent

    override fun onCreate() {
        super.onCreate()
      carComponent= DaggerCarComponent.builder()
            .powerCapacity(300)
            .engineCapacity(100)
            .build()
    }
    fun  carComponent():CarComponent{
        return carComponent

    }
}