package com.luseen.basearch.base;

import android.arch.lifecycle.LifecycleFragment;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Chatikyan on 22.05.2017.
 */

public abstract class BaseFragment<V extends BaseContract.View, P extends BaseContract.Presenter<V>>
        extends LifecycleFragment implements BaseContract.View {

    protected P presenter;

    @SuppressWarnings("unchecked")
    @CallSuper
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        BaseViewModel<V, P> viewModel = ViewModelProviders.of(this).get(BaseViewModel.class);
        if (viewModel.getPresenter() == null) {
            viewModel.setPresenter(initPresenter());
        }
        presenter = viewModel.getPresenter();
        presenter.attachLifecycle(getLifecycle());
        presenter.attachView((V) this);
    }

    @SuppressWarnings("unchecked")
    @CallSuper
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        presenter.detachLifecycle(getLifecycle());
        presenter.detachView();
    }

    protected abstract P initPresenter();
}
