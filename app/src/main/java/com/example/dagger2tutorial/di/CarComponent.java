package com.example.dagger2tutorial.di;

import com.example.dagger2tutorial.MainActivity;
import com.example.dagger2tutorial.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {WheelModule.class, EngineModule.class})
public interface CarComponent {
    void inject(MainActivity activity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);

        CarComponent build();
    }
}
