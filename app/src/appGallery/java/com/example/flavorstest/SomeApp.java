package com.example.flavorstest;


import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

public class SomeApp {
    PrintService printService = new GalleryPrintService();

    public SomeApp() {

    }

    public PrintService getPrintService() {
        return printService;
    }
}
