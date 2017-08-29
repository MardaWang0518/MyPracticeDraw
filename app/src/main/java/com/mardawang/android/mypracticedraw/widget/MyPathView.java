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

public class MyPathView extends View {

    public MyPathView(Context context) {
        super(context);
    }

    public MyPathView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = new Path();
        path.addArc(200, 200, 400, 400, -225, 225);
        path.arcTo(400, 200, 600, 400, -180, 225, false);
        path.lineTo(400, 542);
        path.close();

        Paint paint = new Paint();
        canvas.drawPath(path, paint);

        //**************************
        path.reset();
        paint.setColor(Color.RED);
        path.addArc(300, 600, 500, 800, -225, 225);
        path.arcTo(500, 600, 700, 800, -180, 225, false);
        path.lineTo(500, 942);
        path.close();
        canvas.drawPath(path, paint);

    }
}
