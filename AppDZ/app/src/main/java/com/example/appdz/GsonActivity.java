package com.example.appdz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonActivity extends AppCompatActivity {
    private static final String TAG = "GsonActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gson);

        String  json = "{\n" +
                "\"time_of_year\":\"summer\",\n" +
                "\"year\":2020\n" +
                "}";

        Gson gson = new GsonBuilder().create();
        Season season = gson.fromJson(json, Season.class);

        Log.d(TAG, "onCreate: " + season.getTimeOfYear());
        Log.d(TAG, "onCreate: " + season.getYear());

    }
}
