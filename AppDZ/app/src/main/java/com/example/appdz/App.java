package com.example.appdz;

import android.app.Application;

import androidx.room.Room;
import androidx.room.RoomDatabase;

public class App extends Application {
private static AppDatabase appDatabase;

    @Override
    public void onCreate() {
        super.onCreate();
        appDatabase = Room.databaseBuilder(getApplicationContext(),
                                          AppDatabase.class,"users_database").build();

    }

    public static AppDatabase getAppDatabase(){return appDatabase;}
}
