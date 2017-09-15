package com.mardawang.android.mypracticedraw;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.mardawang.android.mypracticedraw.fragment.AnimatorFragment;
import com.mardawang.android.mypracticedraw.fragment.BreadFragment;
import com.mardawang.android.mypracticedraw.fragment.CanvasClipFragment;
import com.mardawang.android.mypracticedraw.fragment.CircleFragment;
import com.mardawang.android.mypracticedraw.fragment.ColorFragment;
import com.mardawang.android.mypracticedraw.fragment.PathFragment;
import com.mardawang.android.mypracticedraw.fragment.RectFragment;
import com.mardawang.android.mypracticedraw.fragment.TreeFragment;
import com.nshmura.recyclertablayout.RecyclerTabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MyViewActivity extends AppCompatActivity {
    String[] titles = {"drawColor","drawCircle","drawRect","drawPath","树状图","饼状图","canvasClip","animator"};

    private List<Fragment> fragments = new ArrayList<>();
    @BindView(R.id.toolbar)
    Toolbar tool_bar;
    @BindView(R.id.recycler_tab_layout)
    RecyclerTabLayout tab_layout;
    @BindView(R.id.view_pager)
    ViewPager view_pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        ButterKnife.bind(this);
        inflateData();
    }

    private void inflateData() {
        tool_bar.setTitle("曼巴精神");
        setSupportActionBar(tool_bar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ColorFragment colorfragment = new ColorFragment();
        CircleFragment circlefragment = new CircleFragment();
        RectFragment rectfragment = new RectFragment();
        PathFragment pathfragment = new PathFragment();
        TreeFragment treefragment = new TreeFragment();
        BreadFragment breadfragment = new BreadFragment();
        CanvasClipFragment clipfragment = new CanvasClipFragment();
        AnimatorFragment animatefragment = new AnimatorFragment();

        fragments.add(colorfragment);
        fragments.add(circlefragment);
        fragments.add(rectfragment);
        fragments.add(pathfragment);
        fragments.add(treefragment);
        fragments.add(breadfragment);
        fragments.add(clipfragment);
        fragments.add(animatefragment);
        view_pager.setCurrentItem(0);

        ViewPagerAdapter mAdapter = new ViewPagerAdapter(getSupportFragmentManager(),titles,fragments);
        view_pager.setAdapter(mAdapter);

        tab_layout.setIndicatorHeight(6);
        tab_layout.setUpWithViewPager(view_pager);

        view_pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                view_pager.setCurrentItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

}
