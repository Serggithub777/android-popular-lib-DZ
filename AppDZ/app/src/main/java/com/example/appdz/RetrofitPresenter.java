package com.example.appdz;

import android.content.Context;
import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class RetrofitPresenter extends MvpPresenter <MainView> {
    public static final String TAG = "RetrofitPresenter";

    private RetrofitApi retrofitApi;
    public RetrofitPresenter() {
        retrofitApi = new RetrofitApi();
    }

    public void getString() {
        Observable<User> single = retrofitApi.requestServer();

       Disposable disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(user -> {
           if (user != null) {
               getViewState().setText(user.getAvatarUrl());
               getViewState().setPicture(user.getAvatarUrl());
               Log.d(TAG, "onNext: " + user.getLogin());
               Log.d(TAG, "onNext: " + user.getAvatarUrl());
               Log.d(TAG, "onNext: " + user.getCompany());
           }

       }, throwable -> {
           Log.e(TAG, "onError");
       });
    }
}
