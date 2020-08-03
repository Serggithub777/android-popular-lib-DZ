package com.example.appdz;

import android.util.Log;

public class Green {
    public static final String TAG ="Green";
    public String str = "Green";

    public String show() {
        Log.d(TAG, "Green.show: " + str);
        return str;
    }


}
