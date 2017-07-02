package com.luseen.basearch.main.second_fragment;

import com.luseen.arch.BasePresenter;

/**
 * Created by Chatikyan on 01.07.2017.
 */

public class SecondFragmentPresenter extends BasePresenter<SecondFragmentContract.View>
        implements SecondFragmentContract.Presenter {

    @Override
    public void doSomeWork() {
        if (isViewAttached())
            getView().showSomething();
    }

    @Override
    public void onPresenterCreated() {
        super.onPresenterCreated();
        doSomeWork();
    }
}
