package com.mardawang.android.mypracticedraw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by mardawang on 2017/8/11.
 */

public class MainActivity extends Activity {

    private Button btn_view;
    private Button btn_basier;
    private Button btn_animate;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_view = (Button) findViewById(R.id.btn_view);
        btn_basier = (Button) findViewById(R.id.btn_basier);
        btn_animate = (Button) findViewById(R.id.btn_animate);

        btn_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MyViewActivity.class));
            }
        });

        btn_basier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BasierActivity.class));
            }
        });

        btn_animate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BasierActivity.class));
            }
        });

    }
}
