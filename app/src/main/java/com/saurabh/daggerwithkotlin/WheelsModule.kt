package com.saurabh.daggerwithkotlin

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun providesRims():Rims{
      System.out.println("rimes modules")
        return Rims()
    }
    @Provides
    fun providesTires():Tires{
        System.out.println("Tires Module")
        return Tires()
    }
    @Provides
    fun providesWheels(rims: Rims,tires: Tires):Wheels{
       System.out.println("Wheel Module")
        return Wheels(rims,tires)
    }

}