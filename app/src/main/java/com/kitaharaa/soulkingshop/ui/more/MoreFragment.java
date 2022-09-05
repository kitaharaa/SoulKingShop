package com.kitaharaa.soulkingshop.ui.more;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.kitaharaa.soulkingshop.R;
import com.kitaharaa.soulkingshop.adapter.MoreRecyclerViewAdapter;

/* Fragment for displaying available options in app */
public class MoreFragment extends Fragment {
    View fragmentView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentView = inflater.inflate(R.layout.fragment_more, container, false);
        return fragmentView;
    }

    /* Set adapter to RecyclerView */
    @Override
    public void onStart() {
        super.onStart();

        RecyclerView recyclerView = fragmentView.findViewById(R.id.recyclerView);
        MoreRecyclerViewAdapter adapter = new MoreRecyclerViewAdapter(
                        getActivity().getResources().
                        getStringArray(R.array.more_item_titles),
                        getRecyclerViewIcons());

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter.setOnItemClickListener(onItemClickListener);
    }

    /* Perform an action when RecycleView item is clicked */
    private View.OnClickListener onItemClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) view.getTag();
            int position = viewHolder.getAdapterPosition();
            Toast.makeText(getActivity().getApplicationContext(), "you clicked " + position, Toast.LENGTH_SHORT).show();
        }
    };

    /* Return RecyclerView icons */
    private int[] getRecyclerViewIcons() {
        int[] moreIcons = {
                R.drawable.my_orders_icon,
                R.drawable.viewed_items_icon,
                R.drawable.message_icon,
                R.drawable.sales_icon,
                R.drawable.manager_mode_icon,
                R.drawable.support_icon,
                R.drawable.information_icon
        };

        return moreIcons;
    }
}