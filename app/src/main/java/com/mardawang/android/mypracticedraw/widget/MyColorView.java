package com.mardawang.android.mypracticedraw.widget;

import android.content.Context;
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


    public MyColorView(Context context) {
        super(context);
    }

    public MyColorView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.kobe), 0, 0, paint);

        paint.setColor(getResources().getColor(R.color.color_purple));
        paint.setTextSize(32);
        canvas.drawText("低头不是认输", 100, 400, paint);
        paint.setTextSize(40);
        canvas.drawText("是要看清自己脚下的路", 100, 450, paint);
        paint.setTextSize(48);
        canvas.drawText("昂头不是骄傲", 100, 510, paint);
        paint.setTextSize(54);
        canvas.drawText("是要看见自己的天空", 100, 580, paint);
    }
}
