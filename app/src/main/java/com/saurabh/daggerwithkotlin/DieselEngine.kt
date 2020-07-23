package com.saurabh.daggerwithkotlin

import javax.inject.Inject

class DieselEngine:Engine{
    @Inject
    constructor(){

    }
    override fun start() {
        System.out.println("Diesel engine started")
    }

}