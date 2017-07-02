package com.luseen.basearch.main.secondActivity;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

import com.luseen.arch.BasePresenter;

/**
 * Created by Chatikyan on 29.06.2017.
 */

public class SecondActivityPresenter extends BasePresenter<SecondActivityContract.View> implements SecondActivityContract.Presenter {

    @OnLifecycleEvent(value = Lifecycle.Event.ON_CREATE)
    protected void onCreate() {
        if (isViewAttached())
            getView().openDetailFragment();
    }
}
