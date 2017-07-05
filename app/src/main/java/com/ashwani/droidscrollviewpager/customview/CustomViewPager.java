package com.ashwani.droidscrollviewpager.customview;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.ashwani.droidscrollviewpager.R;

/**
 * Created by hp on 7/5/2017.
 */

public class CustomViewPager extends ViewPager {

    private int childId;

    public CustomViewPager(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        if(childId > 0){
            View scroll = findViewById(childId);
            if (scroll != null) {
                Rect rect = new Rect();
                scroll.getHitRect(rect);
                if (rect.contains((int) ev.getX(), (int) ev.getY())) {
                    return false;
                }
            }
        }

        return super.onInterceptTouchEvent(ev);
    }

    public void setChildId(int id){
        this.childId = id;
    }
}
