package com.kitaharaa.soulkingshop.ui.main;

import androidx.annotation.NonNull;

import android.os.Bundle;

import com.kitaharaa.soulkingshop.R;
import com.kitaharaa.soulkingshop.ui.base.BaseActivity;

public class MainActivity extends BaseActivity<MainPresenter> implements MainView{

    @NonNull
    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}