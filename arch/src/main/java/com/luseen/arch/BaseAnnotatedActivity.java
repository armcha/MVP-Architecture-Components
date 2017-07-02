package com.luseen.arch;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;

/**
 * Created by Chatikyan on 29.06.2017.
 */

public abstract class BaseAnnotatedActivity<V extends BaseContract.View, P extends BaseContract.Presenter<V>> extends BaseActivity<V, P> {

    @CallSuper
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int layoutResId = getClass().getAnnotation(Viewable.class).layout();
        if (layoutResId != Constants.LAYOUT_NOT_DEFINED)
            setContentView(layoutResId);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected P initPresenter() {
        return (P) AnnotationHelper.createPresenter(getClass());
    }
}
