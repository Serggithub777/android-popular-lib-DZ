package com.example.appdz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;
import moxy.presenter.ProvidePresenter;

public class RetrofitActivity extends MvpAppCompatActivity implements MainView{

    public static final String TAG = "RetrofitActivity";

    @InjectPresenter
    RetrofitPresenter retrofitPresenter;

    @ProvidePresenter
    public RetrofitPresenter providePresenter() {
        return new RetrofitPresenter();
    }
    @BindView(R.id.textPictureUrl)
    TextView textPictureUrl;
    @BindView(R.id.imageViewPicture)
    ImageView imageAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        ButterKnife.bind(this);
    }

    @OnClick (R.id.buttonGetPicture)
    public void onClickGetPictureButton() {
        Log.d(TAG, "onClick: ");
       retrofitPresenter.getString();
    }

    @Override
    public void setText(String text) {
        textPictureUrl.setText(text);
    }

    @Override
    public void setPicture(String url) {
         Glide
                 .with(this)
                 .load(url)
                 .into(imageAvatar);
    }
}
