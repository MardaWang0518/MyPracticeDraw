package com.mardawang.android.mypracticedraw.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import com.mardawang.android.mypracticedraw.R;

/**
 * Created by mardawang on 2017/7/11.
 */

public class MyTreeView extends View {

    public MyTreeView(Context context) {
        super(context);
    }

    public MyTreeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = new Path();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(6);
        path.moveTo(1000,1205);
        path.lineTo(100,1205);
        path.lineTo(100,200);

        canvas.drawPath(path,paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getResources().getColor(R.color.color_green));
        canvas.drawRect(200, 150, 275, 1200, paint);

        canvas.drawRect(300, 600, 375, 1200, paint);

        canvas.drawRect(400, 700, 475, 1200, paint);

        canvas.drawRect(500, 380, 575, 1200, paint);

        canvas.drawRect(600, 450, 675, 1200, paint);

        canvas.drawRect(700, 488, 775, 1200, paint);

        canvas.drawRect(800, 366, 875, 1200, paint);

        paint.setColor(getResources().getColor(R.color.color_orange));
        paint.setTextSize(44);
        paint.setAntiAlias(true);
        canvas.drawText("科比",180,1260,paint);

        paint.setColor(Color.GREEN);
        paint.setTextSize(28);

        canvas.drawText("祖巴茨",300,1250,paint);

        canvas.drawText("小南斯",400,1250,paint);

        canvas.drawText("莺歌",500,1250,paint);

        canvas.drawText("兰德尔",600,1250,paint);

        canvas.drawText("克拉克森",690,1250,paint);

        canvas.drawText("球哥",820,1250,paint);


        paint.setTextSize(36);
        paint.setColor(Color.WHITE);
        canvas.drawText("Lakers",950,1250,paint);
        canvas.drawText("天赋值",70,220,paint);

    }
}
