package com.luseen.basearch.main.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luseen.arch.BaseFragment;
import com.luseen.basearch.R;

public class DetailFragment extends BaseFragment<DetailContract.View, DetailContract.Presenter> implements DetailContract.View {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void showSomething() {

    }

    @Override
    protected DetailContract.Presenter initPresenter() {
        return new DetailPresenter();
    }
}
