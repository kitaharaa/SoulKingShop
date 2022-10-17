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
 * Fragment for searching essential instrument
 */
public class SearchFragment extends Fragment {
    View fragmentView;
    private boolean isManagerMode = false;

    /* Constructor without parameters */
    public SearchFragment() {
    }

    /* Constructor with parameter */
    public SearchFragment(boolean isManagerMode) {
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
            fragmentView = inflater.inflate(R.layout.fragment_search_manager_mode, container, false);
        } else {
            fragmentView = inflater.inflate(R.layout.fragment_search, container, false);
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