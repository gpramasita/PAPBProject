package com.example.gpramasita.papbproject;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.widget.Button;

/**
 * Created by gpramasita on 12/7/17.
 */

public class PageActivity extends FragmentPagerAdapter {

    int tabCount;
    Button btnA, btnD, btnS, btnL;

    public PageActivity (FragmentManager manage, int tabCount){
        super(manage);
        this.tabCount = tabCount;

    }

    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                FragmentAccount fragmentAccount = new FragmentAccount();
                return fragmentAccount;
            case 1:
                FragmentDetails fragmentDetails = new FragmentDetails();
                return fragmentDetails;
            case 2:
                FragmentSocial fragmentSocial = new FragmentSocial();
                return fragmentSocial;
            case 3:
                FragmentLeader fragmentLeader = new FragmentLeader();
                return fragmentLeader;
            default: return null;
        }
    }

    @Override
    public int getCount(){
        return tabCount;
    }

}
