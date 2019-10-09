package com.example.dagger2tutorial;

import dagger.Component;
import dagger.Module;

@Component(modules = WheelModule.class)
public interface CarComponent {
    Car getCar();

    void inject(MainActivity activity);

}
