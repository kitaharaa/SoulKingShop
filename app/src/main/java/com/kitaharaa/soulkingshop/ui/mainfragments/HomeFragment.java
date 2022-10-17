package com.kitaharaa.soulkingshop.ui.mainfragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.kitaharaa.soulkingshop.R;
import com.kitaharaa.soulkingshop.listeners.FloatingActionButtonListener;

/*
 * Display home page
 */
public class HomeFragment extends Fragment {
    View fragmentView;
    private static boolean isManagerMode = false;

    /* Constructor without parameter */
    public HomeFragment() {
    }

    /* Pass value to isManagerMode */
    public HomeFragment(boolean isManagerMode) {
        this.isManagerMode = isManagerMode;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (isManagerMode) {
            fragmentView = inflater.inflate(R.layout.fragment_home_manager_mode, container, false);
        } else {
            fragmentView = inflater.inflate(R.layout.fragment_home, container, false);
        }
        return fragmentView;
    }

    @Override
    public void onStart() {
        super.onStart();

        if (isManagerMode) {
            // Do some actions
        } else {
            FloatingActionButton basketFab = getView().findViewById(R.id.basket_fab);
            basketFab.setOnClickListener(new FloatingActionButtonListener(fragmentView));
        }
    }
}