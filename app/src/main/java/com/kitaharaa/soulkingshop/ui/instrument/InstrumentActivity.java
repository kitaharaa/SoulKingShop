package com.kitaharaa.soulkingshop.ui.instrument;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.kitaharaa.soulkingshop.R;
import com.kitaharaa.soulkingshop.adapter.SectionsPagerAdapter;

public class InstrumentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrument);

        manageToolbar();
    }

    private void manageToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.toolbar_title));
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        toolbar.setBackgroundResource(R.color.toolbar_color);

        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager(), getLifecycle());
        ViewPager2 pager = (ViewPager2) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        String[] tabNames = getResources().
                getStringArray(R.array.instrument_tab_names);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        new TabLayoutMediator(tabLayout, pager,
                (tab, position) -> tab.setText(tabNames[position])
        ).attach();
    }
}