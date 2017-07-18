package com.mardawang.android.mypracticedraw.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import com.mardawang.android.mypracticedraw.R;

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

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(300, 300, 180, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(800, 300, 180, paint);

        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(300, 800, 180, paint);

        paint.setStrokeWidth(50);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(800, 800, 150, paint);


        //彩票转盘半圆
        paint.setStrokeWidth(8);
        paint.setColor(getResources().getColor(R.color.color_orange));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawArc(250,800,850,1400,0,180,true,paint);

        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(250,800,850,1400,0,45,true,paint);
        canvas.drawArc(250,800,850,1400,45,45,true,paint);
        canvas.drawArc(250,800,850,1400,90,45,true,paint);
        canvas.drawArc(250,800,850,1400,135,45,true,paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getResources().getColor(R.color.color_orange));
        canvas.drawArc(400,950,700,1250,0,180,true,paint);
        paint.setStrokeWidth(8);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        canvas.drawArc(400,950,700,1250,0,180,true,paint);

        paint.setStrokeWidth(3);
        paint.setTextSize(36);
        canvas.drawText("开奖",500,1170,paint);
        canvas.drawText("大单",280,1170,paint);
        canvas.drawText("小单",450,1300,paint);
        canvas.drawText("小双",620,1300,paint);
        canvas.drawText("大双",750,1170,paint);

    }
}
