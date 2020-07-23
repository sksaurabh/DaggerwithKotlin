package com.saurabh.daggerwithkotlin

import javax.inject.Inject

class Remote {
    lateinit var car:Car
    @Inject
   constructor(){

   }
    fun provideCar(car: Car){
        System.out.println("providing car to temote")
        this.car=car
    }
}