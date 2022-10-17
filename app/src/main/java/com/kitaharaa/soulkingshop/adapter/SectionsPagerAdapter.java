package com.kitaharaa.soulkingshop.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.kitaharaa.soulkingshop.ui.instrumentfragments.CharacteristicFragment;
import com.kitaharaa.soulkingshop.ui.instrumentfragments.FeedbackFragment;
import com.kitaharaa.soulkingshop.ui.instrumentfragments.InformationFragment;
import com.kitaharaa.soulkingshop.ui.instrumentfragments.QuestionFragment;

/*
 * Bind fragments to TabLayout elements
 */
public class SectionsPagerAdapter extends FragmentStateAdapter {
    public SectionsPagerAdapter(FragmentManager fragmentManager,
                                Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new InformationFragment();
            case 1:
                return new CharacteristicFragment();
            case 2:
                return new FeedbackFragment();
            case 3:
                return new QuestionFragment();
        }
        return null;
    }

    /* Return item count */
    @Override
    public int getItemCount() {
        return 4;
    }
}