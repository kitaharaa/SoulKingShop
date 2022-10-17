package com.kitaharaa.soulkingshop.ui.instrumentfragments;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.kitaharaa.soulkingshop.R;
import com.kitaharaa.soulkingshop.listeners.BuyButtonListener;
import com.kitaharaa.soulkingshop.listeners.RadioButtonListener;

/*
 * Display chosen instrument
 */
public class InformationFragment extends Fragment {
    private View fragmentView;
    private static boolean isFavoriteChecked = false;
    private static boolean isBasketChecked = false;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentView = inflater.inflate(R.layout.fragment_information, container, false);
        return fragmentView;
    }

    /* Set listeners */
    @Override
    public void onStart() {
        super.onStart();

        setProductFullDescriptionListener();

        RadioButton favoriteRadioButton = getView().findViewById(R.id.favorite_radioButton);
        favoriteRadioButton.setOnClickListener(new RadioButtonListener(
                favoriteRadioButton, R.drawable.unchecked_favorite,
                R.drawable.checked_favorite, "Вподобане"));

        RadioButton basketRadioButton = getView().findViewById(R.id.basket_radioButton);
        basketRadioButton.setOnClickListener(new RadioButtonListener(
                basketRadioButton, R.drawable.unchecked_basket,
                R.drawable.checked_basket, "Вже у кошику"));

        Button buyButton = getView().findViewById(R.id.buy_button);
        buyButton.setOnClickListener(new BuyButtonListener());
    }

    /* Set listener to layout */
    private void setProductFullDescriptionListener() {
        ConstraintLayout fullDescriptionLayout = getView().findViewById(R.id.full_description_linearLayout);

        fullDescriptionLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "full description clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}