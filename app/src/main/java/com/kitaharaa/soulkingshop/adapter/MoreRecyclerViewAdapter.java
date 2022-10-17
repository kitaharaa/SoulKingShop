package com.kitaharaa.soulkingshop.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kitaharaa.soulkingshop.R;

/*
 * Class for setting data into RecyclerView in MoreFragment.class
 */
public class MoreRecyclerViewAdapter extends RecyclerView.Adapter<MoreRecyclerViewAdapter.ViewHolder> {
    private final String[] itemsTitle;
    private final int[] itemsIcon;
    static View.OnClickListener onItemClickListener;

    /* Set passed parameter */
    public MoreRecyclerViewAdapter(String[] itemsTitle, int[] itemsIcon) {
        this.itemsTitle = itemsTitle;
        this.itemsIcon = itemsIcon;
    }

    /*
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // Define click listener for the ViewHolder's View
            textView = itemView.findViewById(R.id.item_textView);
            imageView = itemView.findViewById(R.id.item_imageView);

            itemView.setTag(this);
            itemView.setOnClickListener(onItemClickListener);
        }

        /* Return text of recycler view item */
        public TextView getTextView() {
            return textView;
        }

        /* Return image of recycler view item */
        public ImageView getImageView() {
            return imageView;
        }
    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.more_recycler_view_item, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        // Get element from itemTitle and itemIcon at this position and replace the
        // contents of the view with that element
        viewHolder.getTextView().setText(itemsTitle[position]);
        viewHolder.getImageView().setImageResource(itemsIcon[position]);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return itemsTitle.length;
    }

    /* Set listener to items of Recycler View */
    public void setOnItemClickListener(View.OnClickListener itemClickListener) {
        onItemClickListener = itemClickListener;
    }
}