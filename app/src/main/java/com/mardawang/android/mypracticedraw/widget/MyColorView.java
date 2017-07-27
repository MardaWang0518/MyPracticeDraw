package com.mardawang.android.mypracticedraw.widget;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import com.mardawang.android.mypracticedraw.R;

import java.util.Locale;

/**
 * Created by mardawang on 2017/7/11.
 */

public class MyColorView extends View {

    public MyColorView(Context context) {
        super(context);
    }

    public MyColorView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint0 = new Paint();
//
//        paint0.setMaskFilter(new BlurMaskFilter(50, BlurMaskFilter.Blur.NORMAL));
        paint0.setMaskFilter(new EmbossMaskFilter(new float[]{0, 1, 1}, 0.2f, 8, 10));
        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.kobe), 0, 0, paint0);

        Paint paint = new Paint();


        paint.setColor(getResources().getColor(R.color.color_purple));
        paint.setTextSize(32);
//        paint.setTypeface(Typeface.createFromAsset(getContext().getAssets(),"Satisfy-Regular.ttf"));

        String str0  ="低头不是认输";
        canvas.drawText(str0, 100, 400, paint);
        Rect bounds = new Rect();
        paint.getTextBounds(str0, 0, str0.length(), bounds);
        bounds.left += 100;
        bounds.top += 400;
        bounds.right += 100;
        bounds.bottom += 400;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(getResources().getColor(R.color.color_green));
        canvas.drawRect(bounds,paint);

        paint.setColor(getResources().getColor(R.color.color_purple));
        paint.setTextSize(40);
        String str = "是要看清自己脚下的路";

        paint.setTextLocale(Locale.TAIWAN);
        paint.setStrikeThruText(true);
        canvas.drawText(str, 100, 450, paint);

        paint.setTextSize(48);
        canvas.drawText("昂头不是骄傲", 100, 510, paint);

        paint.setTextSize(54);
        paint.setUnderlineText(true);
        paint.setFakeBoldText(true);
        paint.setTextSkewX(-0.5f);
        canvas.drawTextRun("是要看见自己的天空",0,9,0,9, 100, 580,true, paint);

    }
}
