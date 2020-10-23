package com.example.flavorstest;


public class SomeApp {

    PrintService printService = new PlayPrintService();

    public SomeApp() {

    }

    public PrintService getPrintService() {
        return printService;
    }
}
