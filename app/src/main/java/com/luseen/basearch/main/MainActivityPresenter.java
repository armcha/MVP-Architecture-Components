package com.luseen.basearch.main;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.luseen.basearch.base.BasePresenter;


/**
 * Created by Chatikyan on 20.05.2017.
 */

public class MainActivityPresenter extends BasePresenter<MainActivityContract.View> implements MainActivityContract.Presenter {

    private static final String PROGRESS_BAR_PERCENT_KEY = "progress_bar_percent_key";
    private static final String PROGRESS_BAR_STATE_KEY = "progress_bar_state_key";
    private static final String TAG = "MainActivityPresenter";

    private Bundle viewStateBundle = getStateBundle();
    private long progressTime;

    @Override
    public void doSomethingAfterDelay(long delay) {
        progressTime = delay;
        if (isViewAttached()) {
            getView().showProgress();
            viewStateBundle.putBoolean(PROGRESS_BAR_STATE_KEY, true);
        }

        new Handler().postDelayed(() -> {
            if (isViewAttached()) {
                getView().hideProgress();
                viewStateBundle.putBoolean(PROGRESS_BAR_STATE_KEY, false);
                viewStateBundle.putInt(PROGRESS_BAR_PERCENT_KEY, 0);
            }
        }, delay);

        updateProgress();
    }

    private void updateProgress() {
        new Handler().postDelayed(() -> {
            if (isViewAttached()) {
                int percent = viewStateBundle.getInt(PROGRESS_BAR_PERCENT_KEY);
                viewStateBundle.putInt(PROGRESS_BAR_PERCENT_KEY, ++percent);
                getView().updateProgressPercentage(percent);
                if (viewStateBundle.getBoolean(PROGRESS_BAR_STATE_KEY))
                    updateProgress();
                else {
                    viewStateBundle.putInt(PROGRESS_BAR_PERCENT_KEY, 0);
                }
            }
        }, progressTime / 100);
    }

    @OnLifecycleEvent(value = Lifecycle.Event.ON_CREATE)
    protected void onCreate() {
        if (viewStateBundle.getBoolean(PROGRESS_BAR_STATE_KEY)) {
            if (isViewAttached())
                getView().showProgress();
        }
    }

    @OnLifecycleEvent(value = Lifecycle.Event.ON_DESTROY)
    protected void onDestroy() {
        if (isViewAttached())
            getView().hideProgress();
    }

    @Override
    public void onPresenterDestroy() {
        super.onPresenterDestroy();
        Log.d(TAG, "Presenter destroyed");
    }
}
