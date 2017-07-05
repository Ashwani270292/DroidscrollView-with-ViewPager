package com.ashwani.droidscrollviewpager.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.ashwani.droidscrollviewpager.R;
import com.greycellofp.droiduiscrollview.DroidUIScrollView;
import com.greycellofp.droiduiscrollview.MyScrollInterface;

/**
 * Created by hp on 7/5/2017.
 */

public class CustomPagerAdapter extends PagerAdapter implements MyScrollInterface{

    private Context mContext;
    private final String TAG = CustomPagerAdapter.class.getSimpleName();

    @Override
    public void getScollDeltaX(int deltaX) {
        Log.d(TAG,"Scrolled X by: "+deltaX);
        //apply movement on your recycler views here for x direction
    }

    @Override
    public void getScrollDeltaY(int deltaY) {
        Log.d(TAG,"Scrolled Y by: "+deltaY);
        //apply movement on your recycler views here for y direction
    }

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
        DroidUIScrollView droidUIScrollView = (DroidUIScrollView)layout.findViewById(R.id.childView);
        //setting interface here
        droidUIScrollView.setMyScrollInterface(this);

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
