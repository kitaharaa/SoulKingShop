package com.kitaharaa.soulkingshop.listeners;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

/*
 * Perform an action when RecycleView item is clicked
 */
public class MoreRecyclerViewListener implements View.OnClickListener {
    Context activityContext;

    public MoreRecyclerViewListener(Context activityContext) {
        this.activityContext = activityContext;
    }

    @Override
    public void onClick(View view) {
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) view.getTag();
        int position = viewHolder.getAdapterPosition();
        Toast.makeText(activityContext, "you clicked " + position, Toast.LENGTH_SHORT).show();
    }
}
