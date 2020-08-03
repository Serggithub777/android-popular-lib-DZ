package com.example.appdz;

import android.util.Log;

public class White {
    public static final String TAG = "White";

    public White(Green green) {
        Log.d(TAG, "White: " + green.show());
        Log.d(TAG, "White: " + green);

    }
}
