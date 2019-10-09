package com.example.dagger2tutorial.di;

import com.example.dagger2tutorial.car.Rims;
import com.example.dagger2tutorial.car.Tires;
import com.example.dagger2tutorial.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelModule {
    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims,tires);
    }
}
