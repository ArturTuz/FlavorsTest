package com.example.flavorstest;

import android.util.Log;

public class PlayPrintService implements PrintService {
    @Override
    public void print() {
        Log.d("PrintService", "Google play");
    }
}
