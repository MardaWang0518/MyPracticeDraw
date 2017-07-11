package com.mardawang.android.mypracticedraw.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by mardawang on 2017/7/11.
 */

public class MyBreadView extends View {

    public MyBreadView(Context context) {
        super(context);
    }

    public MyBreadView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Path path1 = new Path();
        Paint paint11 = new Paint();
        paint11.setStyle(Paint.Style.STROKE);
        paint11.setColor(Color.WHITE);
        paint11.setStrokeWidth(4);
        paint11.setTextSize(50);
        path1.moveTo(400,400);
        path1.lineTo(100,200);
        canvas.drawText("32.8%",150,220,paint11);
        canvas.drawPath(path1,paint11);

        Paint paint1 = new Paint();
        paint1.setColor(Color.YELLOW);
        paint1.setStyle(Paint.Style.FILL);
        canvas.drawArc(300,300,800,800,-180,118,true,paint1);

        //*******************************
        Paint paint22 = new Paint();
        paint22.setStyle(Paint.Style.STROKE);
        paint22.setColor(Color.WHITE);
        paint22.setStrokeWidth(4);
        paint22.setTextSize(50);
        canvas.drawText("25%",750,380,paint22);

        Paint paint2 = new Paint();
        paint2.setColor(Color.GRAY);
        paint2.setStyle(Paint.Style.FILL);
        canvas.drawArc(300,300,800,800,-62,90,true,paint2);

        //*******************************
        Paint paint33 = new Paint();
        paint33.setStyle(Paint.Style.STROKE);
        paint33.setColor(Color.WHITE);
        paint33.setStrokeWidth(4);
        paint33.setTextSize(50);
        canvas.drawText("11.1%",750,750,paint33);

        Paint paint3 = new Paint();
        paint3.setColor(Color.GREEN);
        paint3.setStyle(Paint.Style.FILL);
        canvas.drawArc(300,300,800,800,30,40,true,paint3);

        //*******************************
        Paint paint44 = new Paint();
        paint44.setStyle(Paint.Style.STROKE);
        paint44.setColor(Color.WHITE);
        paint44.setStrokeWidth(4);
        paint44.setTextSize(50);
        canvas.drawText("28.3%",380,840,paint44);

        Paint paint4 = new Paint();
        paint4.setColor(Color.RED);
        paint4.setStyle(Paint.Style.FILL);
        canvas.drawArc(300,300,800,800,60,110,true,paint4);

        //*******************************
        Paint paint55 = new Paint();
        paint55.setStyle(Paint.Style.STROKE);
        paint55.setColor(Color.WHITE);
        paint55.setStrokeWidth(4);
        paint55.setTextSize(50);
        canvas.drawText("2.8%",170,580,paint55);

        Paint paint5 = new Paint();
        paint5.setColor(Color.BLUE);
        paint5.setStyle(Paint.Style.FILL);
        canvas.drawArc(300,300,800,800,170,10,true,paint5);

    }
}
