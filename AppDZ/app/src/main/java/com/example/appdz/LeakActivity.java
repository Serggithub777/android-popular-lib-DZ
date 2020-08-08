package com.example.appdz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;

public class LeakActivity extends AppCompatActivity {
    private static final String TAG = "LeakActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: " + LeakActivity.this);
        leakMethod();

    }

    private void leakMethod() {
        new AsyncTask<Void, Void, Void>(){
            @Override
            protected Void doInBackground(Void... voids) {
                for (int i = 0; i < 30 ; i++) {
                    Log.d(TAG, "doInBackground: " + LeakActivity.this);
                    SystemClock.sleep(1000);
                }
                return null;
            }
        }.execute();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: " + LeakActivity.this);
    }
}
