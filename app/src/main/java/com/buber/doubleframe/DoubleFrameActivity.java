package com.buber.doubleframe;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DoubleFrameActivity extends SingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return DoubleFrameFragment.newInstance();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_twopane;
    }
}
