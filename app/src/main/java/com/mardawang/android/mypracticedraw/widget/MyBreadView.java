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

import com.mardawang.android.mypracticedraw.R;

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

        Path path = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);

        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(4);
        paint.setTextSize(50);
        path.moveTo(150,300);
        path.lineTo(400,300);
        path.rLineTo(400,400);
        canvas.drawText("32.8%",150,260,paint);
        canvas.drawPath(path,paint);

        Paint paint1 = new Paint();
        paint1.setColor(Color.YELLOW);
        paint1.setAntiAlias(true);
        paint1.setStyle(Paint.Style.FILL);
        canvas.drawArc(300,300,800,800,-180,118,true,paint1);

        //*******************************
        canvas.drawText("25%",750,380,paint);

        paint1.setColor(Color.BLACK);
        canvas.drawArc(300,300,800,800,-62,90,true,paint1);

        //*******************************
        canvas.drawText("11.1%",750,750,paint);

        paint1.setColor(Color.GREEN);
        canvas.drawArc(300,300,800,800,30,40,true,paint1);

        //*******************************
        canvas.drawText("28.3%",380,840,paint);

        paint1.setColor(Color.RED);
        canvas.drawArc(300,300,800,800,60,110,true,paint1);

        //*******************************
        canvas.drawText("2.8%",170,580,paint);

        paint1.setColor(Color.BLUE);
        canvas.drawArc(300,300,800,800,170,10,true,paint1);

        //圆环
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        canvas.drawArc(300,1000,700,1400,-180,110,true,paint);
        paint.setColor(Color.RED);
        canvas.drawArc(300,1000,700,1400,-70,20,true,paint);
        paint.setColor(Color.BLACK);
        canvas.drawArc(300,1000,700,1400,-50,70,true,paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(300,1000,700,1400,20,80,true,paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(300,1000,700,1400,100,30,true,paint);
        paint.setColor(Color.GRAY);
        canvas.drawArc(300,1000,700,1400,130,50,true,paint);

        paint.setColor(getResources().getColor(R.color.color_gray6));
        canvas.drawCircle(500,1200,170,paint);

        paint.setColor(Color.WHITE);
        paint.setTextSize(44);
//        canvas.drawText("1453 calories\n burned",380,1200,paint);
        canvas.drawText("android is a nice\n language",380,1200,paint);
    }
}
