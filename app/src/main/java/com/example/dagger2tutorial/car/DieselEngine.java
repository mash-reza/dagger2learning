package com.example.dagger2tutorial.car;

import android.util.Log;

import com.example.dagger2tutorial.car.Engine;

import javax.inject.Inject;
import javax.inject.Named;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";
    private int horsePower;
    private int engineCapaity;

    @Inject
    public DieselEngine(@Named("horsePower")int horsePower,@Named("engineCapacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapaity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started with horse power :" + horsePower+" capacity : "+engineCapaity);
    }
}
