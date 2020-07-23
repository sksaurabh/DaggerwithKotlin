package com.saurabh.daggerwithkotlin

import javax.inject.Inject
import javax.inject.Named

class PetrolEngine:Engine{

    var powerCapacity: Int
    var engineCapacity :Int

    @Inject
    constructor(@Named("power")powerCapacity: Int, @Named("engine")engineCapacity :Int) {
        this.powerCapacity=powerCapacity
        this.engineCapacity=engineCapacity
    }
    override fun start() {
        System.out.println("powerCapacity is"+powerCapacity)
        System.out.println("engineCapacity is"+engineCapacity)
        System.out.println("Petrol engine started")
    }

}