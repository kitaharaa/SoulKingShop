package com.kitaharaa.soulkingshop.ui.instrumentfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kitaharaa.soulkingshop.R;
import com.kitaharaa.soulkingshop.adapter.CharacteristicRecyclerViewAdapter;

/*
 * Show chosen instrument characteristic
 */
public class CharacteristicFragment extends Fragment {
    private View fragmentView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentView = inflater.inflate(R.layout.fragment_characteristic, container, false);
        return fragmentView;
    }

    /* Set RecyclerView adapter */
    @Override
    public void onStart() {
        super.onStart();

        int backgroundColor = getResources().getColor(R.color.characteristic_background_color);
        setRecyclerViewAdapter(backgroundColor);
    }

    /* Call Recycler View Adapter*/
    private void setRecyclerViewAdapter(int backgroundColor) {
        RecyclerView recyclerView = getView().findViewById(R.id.recyclerView);
        CharacteristicRecyclerViewAdapter adapter = new CharacteristicRecyclerViewAdapter(
                getActivity().getResources().
                        getStringArray(R.array.characteristic_column_names), backgroundColor);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}