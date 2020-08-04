package com.example.appdz.app;


import com.example.appdz.MainActivity;
import com.example.appdz.Red;
import com.example.appdz.White;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})

public interface AppComponent  {

     void inject (MainActivity mainActivity);
     void inject (Red red);
     void inject (White white);

}
