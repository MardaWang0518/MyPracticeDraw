package com.mardawang.android.mypracticedraw.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import com.mardawang.android.mypracticedraw.R;

/**
 * Created by mardawang on 2017/7/11.
 */

public class MyCanvasClipView extends View {

    public MyCanvasClipView(Context context) {
        super(context);
    }

    public MyCanvasClipView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        Camera camera = new Camera();
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.mipmap.app_logo);


        canvas.drawBitmap(bmp,20,20,paint);

        canvas.save();
        canvas.translate(150, 0);
        canvas.rotate(45, 150, 0);
        canvas.drawBitmap(bmp, 150, 0, paint);
        canvas.restore();

        canvas.save();
        canvas.translate(200, 0);
        canvas.scale(1.5f,1.5f);
        canvas.drawBitmap(bmp, 150, 20, paint);
        canvas.restore();

        canvas.save();
        canvas.translate(230, 0);
        canvas.scale(2.2f,1);
        canvas.drawBitmap(bmp, 200, 20, paint);
        canvas.restore();

        canvas.save();
        canvas.translate(0, 150);
        canvas.skew(0, -0.6f);
        canvas.drawBitmap(bmp, 20, 150, paint);
        canvas.restore();

        canvas.save();
        canvas.translate(100, 150);
        camera.rotateX(50); // 旋转 Camera 的三维空间
        canvas.translate(100, 150); // 旋转之后把投影移动回来
        camera.applyToCanvas(canvas); // 把旋转投影到 Canvas
        canvas.translate(-100, -150); // 旋转之前把绘制内容移动到轴心（原点）
        camera.restore(); // 恢复 Camera 的状态
        canvas.drawBitmap(bmp, 150, 150, paint);
        canvas.restore();

        canvas.save();
        canvas.scale(2,2);
        canvas.translate(300, 200); // 旋转之后把投影移动回来
        canvas.rotate(135, 300, 200);

        Camera camera1 = new Camera();
        camera1.setLocation(0,0,-30);
        camera1.rotateY(-50);
        camera1.applyToCanvas(canvas); // 把旋转投影到 Canvas
        canvas.drawBitmap(bmp, 300, 350, paint);
        canvas.restore();


    }
}
