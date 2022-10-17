package com.kitaharaa.soulkingshop.ui.main;

import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.kitaharaa.soulkingshop.ui.base.BaseView;

public interface MainView extends BaseView {
    void setBottomNavigationViewListener(BottomNavigationView navigationView,
                                         boolean isManagerMode);

    void setFragment(Fragment fragment);
}
