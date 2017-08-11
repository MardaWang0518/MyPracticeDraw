package com.mardawang.android.mypracticedraw;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * Created by mardawang on 2017/8/11.
 */

public class BasierActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basaier);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
