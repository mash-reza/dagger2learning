package com.example.dagger2tutorial;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    @Inject
    Wheels wheels;
    @Inject
    Engine engine;
    @Inject
    Remote remote;

    @Inject
    public Car() {
        Log.d(TAG, "car constructor call");
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        Log.d(TAG, "driving...");
    }
}
