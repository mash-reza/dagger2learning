package com.example.dagger2tutorial.di;

import com.example.dagger2tutorial.MainActivity;
import com.example.dagger2tutorial.car.Car;

import dagger.Component;

@Component(modules = {WheelModule.class,EngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity activity);

}
