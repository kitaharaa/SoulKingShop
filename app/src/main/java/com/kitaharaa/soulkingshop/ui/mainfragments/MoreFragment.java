package com.kitaharaa.soulkingshop.ui.mainfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kitaharaa.soulkingshop.R;
import com.kitaharaa.soulkingshop.adapter.MoreRecyclerViewAdapter;
import com.kitaharaa.soulkingshop.listeners.MoreRecyclerViewListener;

/*
 * Fragment for displaying available options in app
 */
public class MoreFragment extends Fragment {
    View fragmentView;
    private boolean isManagerMode = false;

    /* Constructor without parameter */
    public MoreFragment() {
    }

    /* Constructor with parameter */
    public MoreFragment(boolean isManagerMode) {
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
            fragmentView = inflater.inflate(R.layout.fragment_more_manager_mode, container, false);
        } else {
            fragmentView = inflater.inflate(R.layout.fragment_more, container, false);
        }

        return fragmentView;
    }

    /* Set adapter to RecyclerView */
    @Override
    public void onStart() {
        super.onStart();

        if (isManagerMode) {
            setRecyclerViewPreferences(getActivity().getResources().
                    getStringArray(R.array.more_item_titles_manager_mode), getRecyclerViewIcons(isManagerMode));
        } else {
            setRecyclerViewPreferences(getActivity().getResources().
                    getStringArray(R.array.more_item_titles), getRecyclerViewIcons(isManagerMode));
        }
    }

    /* RecyclerView preferences */
    private void setRecyclerViewPreferences(String[] names, int[] icons) {
        RecyclerView recyclerView = fragmentView.findViewById(R.id.recyclerView);
        MoreRecyclerViewAdapter adapter =
                new MoreRecyclerViewAdapter(names, icons);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter.setOnItemClickListener(new MoreRecyclerViewListener
                (getActivity().getApplicationContext()));
    }


    /* Return RecyclerView icons */
    private int[] getRecyclerViewIcons(boolean isManagerMode) {
        int[] moreIcons;
        if (isManagerMode) {
            moreIcons = new int[]{
                    R.drawable.my_orders_icon,
                    R.drawable.viewed_items_icon,
                    R.drawable.message_icon,
                    R.drawable.sales_icon,
                    R.drawable.information_icon};
        } else {
            moreIcons = new int[]{
                    R.drawable.my_orders_icon,
                    R.drawable.viewed_items_icon,
                    R.drawable.message_icon,
                    R.drawable.sales_icon,
                    R.drawable.manager_mode_icon,
                    R.drawable.support_icon,
                    R.drawable.information_icon};
        }
        return moreIcons;
    }
}