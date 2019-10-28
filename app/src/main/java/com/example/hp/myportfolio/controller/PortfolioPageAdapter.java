package com.example.hp.myportfolio.controller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.hp.myportfolio.views.AboutFragment;
import com.example.hp.myportfolio.views.ContactFragment;
import com.example.hp.myportfolio.views.SkillsFragment;
import com.example.hp.myportfolio.views.WorkFragment;

public class PortfolioPageAdapter extends FragmentPagerAdapter {


    public PortfolioPageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0: return new AboutFragment();
            case 1: return new WorkFragment();
            case 2: return new SkillsFragment();
            case 3: return new ContactFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0: return "About";
            case 1: return "Work";
            case 2: return "Skills";
            case 3: return "Contact";
        }
        return null;
    }
}
