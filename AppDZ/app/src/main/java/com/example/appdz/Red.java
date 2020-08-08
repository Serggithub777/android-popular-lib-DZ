package com.example.appdz;

import android.util.Log;

public class Red {
     public static final String TAG ="Red";

    public Red() {
        Green green = new Green();
        Log.d(TAG, "Red: " + green.show());
        Log.d(TAG, "Red: " + green);
   }
}
