package com.kitaharaa.soulkingshop;

import android.app.Application;

public class App extends Application {

    private static App appInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        init(this);
    }

    private static void init(App app) {
        appInstance = app;
    }

    public static App getInstance() {
        return appInstance;
    }
}