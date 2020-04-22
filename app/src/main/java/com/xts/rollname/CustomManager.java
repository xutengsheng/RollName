package com.xts.rollname;

import android.content.Context;
import android.util.AttributeSet;

import androidx.recyclerview.widget.GridLayoutManager;

public class CustomManager extends GridLayoutManager {
    private boolean mScrollEnable;

    public CustomManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public CustomManager(Context context, int spanCount) {
        super(context, spanCount);
    }

    public CustomManager(Context context, int spanCount, int orientation, boolean reverseLayout) {
        super(context, spanCount, orientation, reverseLayout);
    }

    public void setScrollEnable(boolean scroll){
        this.mScrollEnable = scroll;
    }

    @Override
    public boolean canScrollVertically() {
        return mScrollEnable && super.canScrollVertically();
    }

    @Override
    public boolean canScrollHorizontally() {
        return mScrollEnable && super.canScrollHorizontally();
    }
}
