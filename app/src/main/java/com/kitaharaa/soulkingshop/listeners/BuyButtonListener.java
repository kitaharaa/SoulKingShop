package com.kitaharaa.soulkingshop.listeners;

import android.view.View;
import android.widget.Toast;

/*
 * Perform action on buy button clicked
 */
public class BuyButtonListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "buy button clicked", Toast.LENGTH_SHORT).show();
    }
}
