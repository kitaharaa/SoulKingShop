package com.kitaharaa.soulkingshop.listeners;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.kitaharaa.soulkingshop.R;

/*
* FloatingActionButton listener
*/
public class FloatingActionButtonListener implements View.OnClickListener {
    private DrawerLayout drawerLayout;

    /* FloatingActionButtonListener constructor */
    public FloatingActionButtonListener(View fragmentView) {
        drawerLayout = fragmentView.findViewById(R.id.drawer_layout);
    }

    /* Perform action on floating action button click */
    @Override
    public void onClick(View view) {
        drawerLayout.openDrawer(GravityCompat.END);
    }
}