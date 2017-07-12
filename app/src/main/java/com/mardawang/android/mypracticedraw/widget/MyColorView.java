package com.mardawang.android.mypracticedraw.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.mardawang.android.mypracticedraw.R;

/**
 * Created by mardawang on 2017/7/11.
 */

public class MyColorView extends View {
    Paint paint = new Paint();
    Bitmap bmp ;


    public MyColorView(Context context) {
        super(context);
    }

    public MyColorView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.kobe),0, 0, paint);
    }
}
