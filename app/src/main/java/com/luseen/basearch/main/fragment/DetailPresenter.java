package com.luseen.basearch.main.fragment;

import android.util.Log;

import com.luseen.arch.BasePresenter;

/**
 * Created by Chatikyan on 01.07.2017.
 */

public class DetailPresenter extends BasePresenter<DetailContract.View> implements DetailContract.Presenter {


    @Override
    public void doSomeWork() {

    }

    @Override
    public void onPresenterDestroy() {
        super.onPresenterDestroy();
        Log.e("onPresenterDestroy ", "onPresenterDestroy");
    }
}
