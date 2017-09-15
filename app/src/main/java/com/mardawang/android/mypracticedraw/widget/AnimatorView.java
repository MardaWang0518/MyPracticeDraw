package com.mardawang.android.mypracticedraw.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by mardawang on 2017/7/11.
 */

public class AnimatorView extends View {
    float progress = 0;
    RectF arcRectF = new RectF(100,100,500,500);
    Paint paint = new Paint();
    public AnimatorView(Context context) {
        super(context);
    }

    public AnimatorView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    // 创建 getter 方法
    public float getProgress() {
        return progress;
    }

    // 创建 setter 方法
    public void setProgress(float progress) {
        this.progress = progress;
        invalidate();
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStrokeWidth(10);
        canvas.drawArc(arcRectF, 135, progress * 2.7f, false, paint);
    }

}
