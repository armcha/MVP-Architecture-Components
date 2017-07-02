package com.luseen.arch;


import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;

/**
 * Created by Chatikyan on 20.05.2017.
 */

public abstract class BasePresenter<V extends BaseContract.View> implements LifecycleObserver, BaseContract.Presenter<V> {

    private Bundle stateBundle;
    private V view;

    @Nullable
    @Override
    final public V getView() {
        return view;
    }

    @Override
    final public void attachLifecycle(Lifecycle lifecycle) {
        lifecycle.addObserver(this);
    }

    @Override
    final public void detachLifecycle(Lifecycle lifecycle) {
        lifecycle.removeObserver(this);
    }

    @Override
    final public void attachView(V view) {
        this.view = view;
    }

    @Override
    final public void detachView() {
        view = null;
    }

    @Override
    final public boolean isViewAttached() {
        return view != null;
    }

    @Override
    final public Bundle getStateBundle() {
        return stateBundle == null
                ? stateBundle = new Bundle()
                : stateBundle;
    }

    @CallSuper
    @Override
    public void onPresenterDestroy() {
        if (stateBundle != null && !stateBundle.isEmpty()) {
            stateBundle.clear();
        }
    }

    @Override
    public void onPresenterCreated() {
        //NO-OP
    }
}
