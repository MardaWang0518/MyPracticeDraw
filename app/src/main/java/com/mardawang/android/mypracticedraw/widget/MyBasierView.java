package com.mardawang.android.mypracticedraw.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * ˮ�������ؼ� ������������http://blog.csdn.net/zhongkejingwang/article/details/38556891
 *
 * @author chenjing
 */
public class MyBasierView extends View {

    private int mViewWidth;
    private int mViewHeight;

    /**
     * ˮλ��
     */
    private float mLevelLine;

    /**
     * �����������
     */
    private float mWaveHeight = 40;
    /**
     * ����
     */
    private float mWaveWidth = 500;
    /**
     * �����ص�����ߵĲ���
     */
    private float mLeftSide;

    private float mMoveLen;
    /**
     * ˮ��ƽ���ٶ�
     */
    public static final float SPEED = 3f;

    private List<Point> mPointsList;
    private Paint mPaint;
    //	private Paint mTextPaint;
    private Path mWavePath;
    private boolean isMeasured = false;

    private Timer timer;
    private MyTimerTask mTask;
    Handler updateHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            // ��¼ƽ����λ��
            mMoveLen += SPEED;
            mLeftSide += SPEED;
            // ����ƽ��
            for (int i = 0; i < mPointsList.size(); i++) {
                mPointsList.get(i).setX(mPointsList.get(i).getX() + SPEED);
                switch (i % 4) {
                    case 0:
                    case 2:
                        mPointsList.get(i).setY(mLevelLine);
                        break;
                    case 1:
                        mPointsList.get(i).setY(mLevelLine + mWaveHeight);
                        break;
                    case 3:
                        mPointsList.get(i).setY(mLevelLine - mWaveHeight);
                        break;
                }
            }
            if (mMoveLen >= mWaveWidth) {
                // ����ƽ�Ƴ���һ���������κ�λ
                mMoveLen = 0;
                resetPoints();
            }
            invalidate();
        }

    };
    private Paint mPaint1;
    private Path mWavePath1;

    /**
     * ���е��x���궼��ԭ����ʼ״̬��Ҳ����һ������ǰ��״̬
     */
    private void resetPoints() {
        mLeftSide = -mWaveWidth;
        for (int i = 0; i < mPointsList.size(); i++) {
            mPointsList.get(i).setX(i * mWaveWidth / 4 - mWaveWidth);
        }
    }

    public MyBasierView(Context context) {
        super(context);
        init();
    }

    public MyBasierView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyBasierView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        mPointsList = new ArrayList<Point>();
        timer = new Timer();

        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Style.FILL);
//        mPaint.setColor(getResources().getColor(R.color.color_paint_01));
        mPaint.setColor(Color.BLUE);

        mWavePath = new Path();
    }

    @Override
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        // ��ʼ����
        start();
    }

    private void start() {
        if (mTask != null) {
            mTask.cancel();
            mTask = null;
        }
        mTask = new MyTimerTask(updateHandler);
        timer.schedule(mTask, 0, 10);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (!isMeasured) {
            isMeasured = true;
            mViewHeight = getMeasuredHeight();
            mViewWidth = getMeasuredWidth();
            // ˮλ�ߴ�����¿�ʼ����
            mLevelLine = mViewHeight - 220;
            // ����View��ȼ��㲨�η�ֵ
            mWaveHeight = mViewWidth / 2.5f;
            // ���������ı�View���Ҳ����View��ֻ�ܿ����ķ�֮һ�����Σ���������ʹ���������
            mWaveWidth = mViewWidth * 4;
            // ������صľ���Ԥ��һ������
            mLeftSide = -mWaveWidth;
            // ��������ڿɼ���View����������ɼ������Σ�ע��n��ȡ��
            int n = (int) Math.round(mViewWidth / mWaveWidth + 0.5);
            // n��������Ҫ4n+1���㣬��������ҪԤ��һ�������������������������Ҫ4n+5����
            for (int i = 0; i < (4 * n + 5); i++) {
                // ��P0��ʼ��ʼ����P4n+4���ܹ�4n+5����
                float x = i * mWaveWidth / 4 - mWaveWidth;
                float y = 0;
                switch (i % 4) {
                    case 0:
                    case 2:
                        // ���λ��ˮλ����
                        y = mLevelLine;
                        break;
                    case 1:
                        // ���²����Ŀ��Ƶ�
                        y = mLevelLine + mWaveHeight;
                        break;
                    case 3:
                        // ���ϲ����Ŀ��Ƶ�
                        y = mLevelLine - mWaveHeight;
                        break;
                }
                mPointsList.add(new Point(x, y));
            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {

        mWavePath.reset();
        int i = 0;
        mWavePath.moveTo(mPointsList.get(0).getX(), mPointsList.get(0).getY());
        for (; i < mPointsList.size() - 2; i = i + 2) {
            mWavePath.quadTo(mPointsList.get(i + 1).getX(),
                    mPointsList.get(i + 1).getY(), mPointsList.get(i + 2)
                            .getX(), mPointsList.get(i + 2).getY());
        }
        mWavePath.lineTo(mPointsList.get(i).getX(), mViewHeight);
        mWavePath.lineTo(mLeftSide, mViewHeight);
        mWavePath.close();

        canvas.drawPath(mWavePath, mPaint);
    }

    class MyTimerTask extends TimerTask {
        Handler handler;

        public MyTimerTask(Handler handler) {
            this.handler = handler;
        }

        @Override
        public void run() {
            handler.sendMessage(handler.obtainMessage());
        }

    }

    class Point {
        private float x;
        private float y;

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }

        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }

    }

}
