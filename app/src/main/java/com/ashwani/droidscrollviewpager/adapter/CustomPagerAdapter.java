package com.ashwani.droidscrollviewpager.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.ashwani.droidscrollviewpager.R;

/**
 * Created by hp on 7/5/2017.
 */

public class CustomPagerAdapter extends PagerAdapter {

    private Context mContext;


    public CustomPagerAdapter(Context context){
        mContext = context;
    }

    @Override
    public int getCount(){
        return 7;//for 3 weeks say
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup)inflater.inflate(R.layout.week_card, container, false);
        container.addView(layout);
        TextView tvCOunt = (TextView)layout.findViewById(R.id.tvCount);
        tvCOunt.setText("Position: "+position);
        Toast.makeText(mContext,"Position: "+position,Toast.LENGTH_SHORT).show();
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Integer.toString(position);
    }
}
