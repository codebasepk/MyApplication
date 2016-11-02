package com.example.khalid.myapplication2.utils;

import android.app.Application;
import android.content.Context;

public class AppGlobals extends Application {

    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }

    public static Context getContext() {
        return sContext;
    }
}
