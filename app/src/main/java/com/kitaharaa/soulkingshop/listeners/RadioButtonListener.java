package com.kitaharaa.soulkingshop.listeners;

import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

/*
 * Perform action on radio button click
 */
public class RadioButtonListener implements View.OnClickListener {
    private final RadioButton radioButton;
    private final int uncheckedIcon;
    private final int checkedIcon;
    private final String buttonName;
    private boolean isChecked = false;

    /* Set passed parameters */
    public RadioButtonListener(RadioButton radioButton, int uncheckedIcon,
                               int checkedIcon, String buttonName) {
        this.radioButton = radioButton;
        this.uncheckedIcon = uncheckedIcon;
        this.checkedIcon = checkedIcon;
        this.buttonName = buttonName;
    }

    /* Perform action on click */
    @Override
    public void onClick(View view) {
        if (!isChecked) {
            radioButton.setBackgroundResource(checkedIcon);
            isChecked = true;
            Toast.makeText(view.getContext(), buttonName + " checked", Toast.LENGTH_SHORT).show();
        } else {
            radioButton.setBackgroundResource(uncheckedIcon);
            isChecked = false;
            Toast.makeText(view.getContext(), buttonName + " UNchecked", Toast.LENGTH_SHORT).show();
        }
    }
}
