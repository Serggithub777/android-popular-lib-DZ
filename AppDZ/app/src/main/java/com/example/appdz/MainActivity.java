package com.example.appdz;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appdz.app.App;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    public static final String TAG ="MainActivity";
    @Inject
    Green green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getAppComponent().inject(this);

        Red red = new Red();
        White white = new White();
        Log.d(TAG, "MainActivity: " + green.show());
        Log.d(TAG, "MainActivity: " + green);


    }
}
