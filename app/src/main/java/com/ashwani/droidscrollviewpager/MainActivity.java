package com.ashwani.droidscrollviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ashwani.droidscrollviewpager.adapter.CustomPagerAdapter;
import com.greycellofp.droiduiscrollview.MyScrollInterface;

public class MainActivity extends AppCompatActivity{

    ViewPager customViewPager;
    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customViewPager = (ViewPager) findViewById(R.id.viewPager);
       // customViewPager.setChildId(R.id.viewPager);
        customViewPager.setAdapter(new CustomPagerAdapter(this));

    }

    // here you will get the values of scrolls loog at the log

}
