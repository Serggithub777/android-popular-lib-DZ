package com.example.appdz.presenter;

import android.util.Log;

import com.example.appdz.model.RetrofitApi;
import com.example.appdz.model.User;
import com.example.appdz.view.RetrofitView;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import retrofit2.Retrofit;

@InjectViewState
public class RetrofitPresenter extends MvpPresenter<RetrofitView> {

    private static final String TAG = "RetrofitPresenter";
    RetrofitApi retrofitApi;

    public RetrofitPresenter() {
        retrofitApi = new RetrofitApi();
    }

    public void getString() {
        Disposable disposable = getUserObservable().observeOn(AndroidSchedulers.mainThread()).subscribe(user -> {
            Log.d(TAG, "onNext: " + user.login);
            getViewState().showName(user.login);
        }, throwable -> {
            Log.e(TAG, "onError");
        });
    }

    public Observable<User> getUserObservable() {
        return retrofitApi.requestServer();
    }

}
