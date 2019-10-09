package com.example.dagger2tutorial.di;

import com.example.dagger2tutorial.car.DieselEngine;
import com.example.dagger2tutorial.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class EngineModule {
    @Provides
    public Engine provideEngine(DieselEngine engine) {
        return engine;
    }
}
