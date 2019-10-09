package com.example.dagger2tutorial.di;

import com.example.dagger2tutorial.car.DieselEngine;
import com.example.dagger2tutorial.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class EngineModule {

    private int horsePower;
    private int horsePower2;

    public EngineModule(int horsePower, int horsePower2) {
        this.horsePower = horsePower;
        this.horsePower2 = horsePower2;
    }

    @Provides
    public int provideHorsePower() {
        return horsePower;
    }


    @Provides
    public Engine provideEngine(DieselEngine engine) {
        return engine;
    }
}
