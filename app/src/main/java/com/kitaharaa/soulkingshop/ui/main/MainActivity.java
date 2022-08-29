package com.kitaharaa.soulkingshop.ui.main;

import static androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;
import com.kitaharaa.soulkingshop.App;
import com.kitaharaa.soulkingshop.R;
import com.kitaharaa.soulkingshop.ui.base.BaseActivity;
import com.kitaharaa.soulkingshop.ui.home.HomeFragment;
import com.kitaharaa.soulkingshop.ui.liked.LikedFragment;
import com.kitaharaa.soulkingshop.ui.more.MoreFragment;
import com.kitaharaa.soulkingshop.ui.search.SearchFragment;

public class MainActivity extends BaseActivity<MainPresenter> implements MainView{
    @NonNull
    @Override
    protected MainPresenter createPresenter() {
        return null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        setBottomNavigationViewListener(bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.home);
    }

    @Override
    public void setBottomNavigationViewListener(BottomNavigationView bottomNavigationView) {
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

    @Override
    public void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.setTransition(TRANSIT_FRAGMENT_FADE);
        fragmentTransaction.commit();
    }
}