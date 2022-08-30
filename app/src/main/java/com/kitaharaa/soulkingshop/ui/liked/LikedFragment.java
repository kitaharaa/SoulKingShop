package com.kitaharaa.soulkingshop.ui.liked;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.kitaharaa.soulkingshop.R;
import com.kitaharaa.soulkingshop.listeners.FloatingActionButtonListener;

public class LikedFragment extends Fragment {
    View fragmentView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentView = inflater.inflate(R.layout.fragment_liked, container, false);
        return fragmentView;
    }

    @Override
    public void onStart() {
        super.onStart();

        FloatingActionButton basketFab = getView().findViewById(R.id.basket_fab);
        basketFab.setOnClickListener(new FloatingActionButtonListener(fragmentView));
    }
}