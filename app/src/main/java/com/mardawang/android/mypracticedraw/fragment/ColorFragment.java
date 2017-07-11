package com.mardawang.android.mypracticedraw.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mardawang.android.mypracticedraw.R;
import com.mardawang.android.mypracticedraw.widget.MyCircleView;

import butterknife.BindView;

/**
 * Created by mardawang on 2017/7/11.
 */

public class ColorFragment extends Fragment {
    @BindView(R.id.mine_view)
    MyCircleView mine_view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_color, container, false);

        return view;
    }
}
