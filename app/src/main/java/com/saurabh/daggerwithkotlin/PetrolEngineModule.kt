package com.saurabh.daggerwithkotlin

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
 class PetrolEngineModule{

   @Provides
    fun providesPetrolEngine(petrolEngine: PetrolEngine): Engine
   {
       return petrolEngine
   }
     // return PetrolEngine(powerCapacity,engineCapacity)



}