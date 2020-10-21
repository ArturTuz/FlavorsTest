package com.example.flavorstest;


import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

public class SomeApp {
    public String store;

    public SomeApp() {
        Logger.addLogAdapter(new AndroidLogAdapter());
        this.store = "App Gallery!!!";
        Logger.d(this.store);
    }
}
