package com.saurabh.daggerwithkotlin

import javax.inject.Inject


class Car {
    @Inject
    lateinit var wheels: Wheels
    lateinit var engine: Engine
    lateinit var driver: Driver
    @Inject
    constructor(engine: Engine,driver: Driver){
        this.driver=driver
        this.engine=engine
    }
     @Inject
    fun provideCarToRemote(remote: Remote){
        remote.provideCar(this)
    }
    fun start(){
        System.out.println("Driver"+driver)
        //System.out.println("Wheels printed"+wheels)
        //engine.start()
       // System.out.println("driving....")
    }
}