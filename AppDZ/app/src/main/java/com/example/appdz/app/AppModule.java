package com.example.appdz.app;

import android.app.Application;

import com.example.appdz.Green;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
class AppModule {
    private final Application application;

    AppModule(Application application) {
        this.application = application;
    }

    @Singleton
    @Provides
    Green provideGreen() {
        return new Green();
    }
}
