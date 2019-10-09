package com.example.dagger2tutorial.car;

import android.util.Log;

import com.example.dagger2tutorial.car.Engine;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";
    private int horsePower;
    private int horsePower2;

    @Inject
    public DieselEngine(int horsePower,int horsePower2) {
        this.horsePower = horsePower;
        this.horsePower2 = horsePower2;
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started with horse power :" + horsePower+" - "+horsePower2);
    }
}
