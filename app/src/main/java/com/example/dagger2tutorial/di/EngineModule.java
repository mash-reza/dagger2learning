package com.example.dagger2tutorial.di;

import com.example.dagger2tutorial.car.DieselEngine;
import com.example.dagger2tutorial.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class EngineModule {
    @Binds
    public abstract Engine bindEngine(DieselEngine engine);
}
