package com.example.appdz;

import android.view.View;

import moxy.MvpView;

public interface MainView extends MvpView {
    void setText(String text);
    void setPicture(String url);
}
