package com.example.appdz;

import android.util.Log;

import com.example.appdz.app.App;

import javax.inject.Inject;

public class White {
    public static final String TAG ="White";

    @Inject Green green;

    public White() {
        App.getAppComponent().inject(this);
        Log.d(TAG,"White: "+ green.show());
        Log.d(TAG,"White: "+ green);


    }
}
