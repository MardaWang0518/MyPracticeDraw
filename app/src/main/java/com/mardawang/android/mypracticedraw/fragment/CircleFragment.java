package com.mardawang.android.mypracticedraw.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mardawang.android.mypracticedraw.R;

/**
 * Created by mardawang on 2017/7/11.
 */

public class CircleFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_circle, container, false);
    }
}
