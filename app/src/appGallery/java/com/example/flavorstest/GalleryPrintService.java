package com.example.flavorstest;

import android.util.Log;

public class GalleryPrintService implements PrintService {
    @Override
    public void print() {
        Log.d("PrintService", "Gallery");
    }
}
