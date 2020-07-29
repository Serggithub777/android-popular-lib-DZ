package com.example.appdz;

import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class RetrofitPresenter {
    public static final String TAG = "RetrofitPresenter";

    private RetrofitApi retrofitApi;

    public RetrofitPresenter() {
        retrofitApi = new RetrofitApi();
    }

    public void getString() {
        Observable<User> single = retrofitApi.requestServer();

       Disposable disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(user -> {
           Log.d(TAG, "onNext: " + user.getLogin());
           Log.d(TAG, "onNext: " + user.getAvatarUrl());
           Log.d(TAG, "onNext: " + user.getCompany());
       }, throwable -> {
           Log.e(TAG, "onError");
       });
    }
}
