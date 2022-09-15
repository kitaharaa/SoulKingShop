package com.kitaharaa.soulkingshop.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kitaharaa.soulkingshop.R;

public class CharacteristicRecyclerViewAdapter extends RecyclerView.Adapter<CharacteristicRecyclerViewAdapter.ViewHolder> {
    private final String[] linesName;
    private String[] linesDescription;
    private final int backgroundColor;
    LinearLayout linearLayout;

    /*
     * Set passed value
     */
    public CharacteristicRecyclerViewAdapter(String[] linesName, String[] linesDescription, int backgroundColor) {
        this.linesName = linesName;
        this.linesDescription = linesDescription;
        this.backgroundColor = backgroundColor;
    }

    /*
     * Set passed value without linesDescription
     */
    public CharacteristicRecyclerViewAdapter(String[] linesName, int backgroundColor) {
        this.linesName = linesName;
        this.backgroundColor = backgroundColor;
    }

    /*
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView name;
        private final TextView description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // Define click listener for the ViewHolder's View
            name = itemView.findViewById(R.id.line_name);
            description = itemView.findViewById(R.id.line_description);
        }

        /* Return text of recycler view item */
        public TextView getName() {
            return name;
        }

        /* Return description of recycler view line */
        public TextView getDescription() {
            return description;
        }
    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public CharacteristicRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.characteristic_recycler_view_item, viewGroup, false);

        linearLayout = view.findViewById(R.id.linearLayout);

        return new CharacteristicRecyclerViewAdapter.ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull CharacteristicRecyclerViewAdapter.ViewHolder viewHolder, int position) {

        // Get element from itemTitle and itemIcon at this position and replace the
        // contents of the view with that element
        viewHolder.getName().setText(linesName[position]);
        //TODO: set description text while DB will be available
        // viewHolder.getDescription().setText(linesDescription[position]);

        changeLayoutBackgroundColor(linearLayout, position + 2, backgroundColor);
    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return linesName.length;
    }

    /* Change a color of unpair line in RecyclerView*/
    private void changeLayoutBackgroundColor(LinearLayout linearLayout,
                                             int position, int backgroundColor) {
        if (position % 2 == 0) {
            linearLayout.setBackgroundColor(backgroundColor);
        }
    }
}
