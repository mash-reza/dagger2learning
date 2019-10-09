package com.example.dagger2tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dagger2tutorial.car.Car;
import com.example.dagger2tutorial.car.DieselEngine;
import com.example.dagger2tutorial.di.CarComponent;
import com.example.dagger2tutorial.di.DaggerCarComponent;
import com.example.dagger2tutorial.di.EngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent component = DaggerCarComponent.builder().engineModule(new EngineModule(100,200)).build();
        component.inject(this);
        car.drive();
    }
}
