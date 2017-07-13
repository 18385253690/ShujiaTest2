package com.example.liuyueyue.shujiatest;

import android.content.Context;
import android.util.AttributeSet;


/**
 * Created by liuyueyue on 2017/7/10.
 */

public class MarqueeText extends android.support.v7.widget.AppCompatTextView{


    public MarqueeText(Context context) {
        super(context);
    }

    public MarqueeText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MarqueeText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean isFocused() {
        return true;
    }
}
