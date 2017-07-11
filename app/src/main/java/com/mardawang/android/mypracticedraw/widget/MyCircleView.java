package com.mardawang.android.mypracticedraw.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by mardawang on 2017/7/11.
 */

public class MyCircleView extends View {

    public MyCircleView(Context context) {
        super(context);
    }

    public MyCircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint1 = new Paint();
        paint1.setColor(Color.BLACK);
        paint1.setAntiAlias(true);
        paint1.setStyle(Paint.Style.FILL);
        canvas.drawCircle(300, 300, 180, paint1);

        Paint paint2 = new Paint();
        paint2.setColor(Color.BLACK);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(800, 300, 180, paint2);

        Paint paint3 = new Paint();
        paint3.setColor(Color.BLUE);
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.FILL);
        canvas.drawCircle(300, 800, 180, paint3);

        Paint paint4 = new Paint();
        paint4.setStrokeWidth(50);
        paint4.setAntiAlias(true);
        paint4.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(800, 800, 150, paint4);
    }
}
