package com.ashwani.droidscrollviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ashwani.droidscrollviewpager.adapter.CustomPagerAdapter;
import com.ashwani.droidscrollviewpager.customview.CustomViewPager;

public class MainActivity extends AppCompatActivity {

    ViewPager customViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customViewPager = (ViewPager) findViewById(R.id.viewPager);
       // customViewPager.setChildId(R.id.viewPager);
        customViewPager.setAdapter(new CustomPagerAdapter(this));

    }
}
