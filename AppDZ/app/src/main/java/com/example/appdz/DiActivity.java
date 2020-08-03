package com.example.appdz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DiActivity extends AppCompatActivity {
    public static final String TAG = "DiActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Green green = new Green();
        Red red = new Red(green);
        White white = new White(green);
    }
}
