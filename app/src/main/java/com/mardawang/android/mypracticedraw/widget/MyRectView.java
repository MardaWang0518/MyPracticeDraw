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

public class MyRectView extends View {


    public MyRectView(Context context) {
        super(context);
    }

    public MyRectView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        canvas.drawRect(100, 100, 500, 500, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(600, 100, 1000, 500, paint);

        paint.setStrokeWidth(10);
        float[] points = {120, 620, 320, 620, 220, 620, 220, 820, 120, 820, 320, 820};
        canvas.drawLines(points, paint);

        canvas.drawRoundRect(500, 620, 900, 820, 50, 50, paint);

        Path path = new Path();
        paint.setStyle(Paint.Style.FILL);
        path.addCircle(400, 1200, 200, Path.Direction.CCW);
        path.addCircle(650, 1200, 200, Path.Direction.CW);
        canvas.drawPath(path, paint);
    }
}
