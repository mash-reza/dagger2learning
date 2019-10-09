package com.example.dagger2tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dagger2tutorial.car.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerCarComponent.create().inject(this);
        car.drive();
    }
}
