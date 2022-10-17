package com.kitaharaa.soulkingshop.ui.main;

import static androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE;

import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.kitaharaa.soulkingshop.R;
import com.kitaharaa.soulkingshop.ui.base.BaseActivity;
import com.kitaharaa.soulkingshop.ui.mainfragments.AddFragment;
import com.kitaharaa.soulkingshop.ui.mainfragments.HomeFragment;
import com.kitaharaa.soulkingshop.ui.mainfragments.LikedFragment;
import com.kitaharaa.soulkingshop.ui.mainfragments.MoreFragment;
import com.kitaharaa.soulkingshop.ui.mainfragments.SearchFragment;

/*
 * Our main activity
 */
public class MainActivity extends BaseActivity<MainPresenter> implements MainView {
    private static boolean isManagerMode = true;

    @NonNull
    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    /* Set preferences depending on mode */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BottomNavigationView bottomNavigationView;

        /* Check is manager mode is enable */
        if (isManagerMode) {
            setContentView(R.layout.activity_main_manager_mode);
            bottomNavigationView = findViewById(R.id.manger_mode_bottomNavigationView);

        } else {
            setContentView(R.layout.activity_main);
            bottomNavigationView = findViewById(R.id.bottomNavigationView);
        }

        setBottomNavigationViewListener(bottomNavigationView, isManagerMode);
        bottomNavigationView.setSelectedItemId(R.id.home);
    }

    /* Set listener to BottomNavigationView */
    @Override
    public void setBottomNavigationViewListener(
            BottomNavigationView bottomNavigationView, boolean isManagerMode) {
        if (isManagerMode) {
            bottomNavigationView.setOnItemSelectedListener(
                    new NavigationBarView.OnItemSelectedListener() {
                        @Override
                        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                            int id = item.getItemId();
                            if (id == R.id.home) {
                                setFragment(new HomeFragment(isManagerMode));
                                return true;
                            } else if (id == R.id.search) {
                                setFragment(new SearchFragment(isManagerMode));
                                return true;
                            } else if (id == R.id.add) {
                                setFragment(new AddFragment());
                                return true;
                            } else if (id == R.id.more) {
                                setFragment(new MoreFragment(isManagerMode));
                                return true;
                            }
                            return false;
                        }
                    });
        } else {
            bottomNavigationView.setOnItemSelectedListener(
                    new NavigationBarView.OnItemSelectedListener() {
                        @Override
                        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                            int id = item.getItemId();
                            if (id == R.id.home) {
                                setFragment(new HomeFragment());
                                return true;
                            } else if (id == R.id.search) {
                                setFragment(new SearchFragment());
                                return true;
                            } else if (id == R.id.liked) {
                                setFragment(new LikedFragment());
                                return true;
                            } else if (id == R.id.more) {
                                setFragment(new MoreFragment());
                                return true;
                            }
                            return false;
                        }
                    });
        }
    }

    /* Set fragment visible */
    @Override
    public void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.setTransition(TRANSIT_FRAGMENT_FADE);
        fragmentTransaction.commit();
    }
}