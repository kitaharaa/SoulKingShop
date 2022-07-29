package com.kitaharaa.soulkingshop.ui.main;

import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.kitaharaa.soulkingshop.ui.base.BaseView;

public interface MainView extends BaseView {
    void setNavigationViewListener(BottomNavigationView navigationView);
    void setFragment(Fragment fragment);
}
