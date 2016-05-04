package com.example.ying.criminaintent;

import android.support.v4.app.Fragment;

/**
 * Created by ying on 2016/5/3.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
