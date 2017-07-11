package com.mardawang.android.mypracticedraw;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mardawang on 2017/7/10.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    String[] titles;
    private List<Fragment> fragments = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm, String[] strs, List<Fragment> fragmentlist) {
        super(fm);
        titles = strs;
        fragments = fragmentlist;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public String getPageTitle(int position) {
        if (titles.length > position) {
            return titles[position];
        } else {
            return "";
        }
    }

}
