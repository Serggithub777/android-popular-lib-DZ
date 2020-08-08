package com.example.appdz.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.appdz.R;
import com.example.appdz.presenter.RetrofitPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;
import moxy.presenter.ProvidePresenter;

public class RetrofitActivity extends MvpAppCompatActivity implements RetrofitView{

    private static final String TAG = "RetrofitActivity";

    @BindView(R.id.text_view_response)
    TextView textViewName;

    @InjectPresenter
    RetrofitPresenter retrofitPresenter;

    @ProvidePresenter
    public RetrofitPresenter providePresenter(){
        retrofitPresenter = new RetrofitPresenter();
        //App.getAppComponent().inject(retrofitPresenter);
        return retrofitPresenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
       // App.getAppComponent().inject(this);
    }

    @OnClick(R.id.button_request)
    public void onClickButton(View view) {
        Log.d(TAG, "onClickButton: ");
        retrofitPresenter.getString();
    }

    @Override
    public void showName(String name) {
        textViewName.setText(name);
    }
}
