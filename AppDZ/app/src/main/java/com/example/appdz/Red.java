package com.example.appdz;

import android.util.Log;

import com.example.appdz.app.App;

import javax.inject.Inject;

public class Red {
    public static final String TAG ="Red";

    @Inject Green green;

    public Red() {
        App.getAppComponent().inject(this);
        Log.d(TAG, "Red: " + green.show());
        Log.d(TAG, "Red: " + green);
    }
}
