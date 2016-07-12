package com.example.android.tourapp;

import android.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by yadia on 7/11/16.
 */
public class SimpleFragmentPageAdapter extends FragmentPagerAdapter{


    public SimpleFragmentPagerAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
        if(position ==0){
            return RestaurantsFragment();  ///return ClassFragmentName
        }else{
            return ViewSitesFragment();
        }
    }

    @Override
    public int getcount(){
        return 2;  //set number of fragment activities
    }
}
