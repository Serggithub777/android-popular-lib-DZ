package com.example.appdz.app;

import android.app.Application;

public class App extends Application {
       private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = generateAppComponent();
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    private AppComponent generateAppComponent() {
        return
    }
}
