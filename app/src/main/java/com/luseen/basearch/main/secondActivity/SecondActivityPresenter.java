package com.luseen.basearch.main.secondActivity;

import com.luseen.arch.BasePresenter;

/**
 * Created by Chatikyan on 29.06.2017.
 */

public class SecondActivityPresenter extends BasePresenter<SecondActivityContract.View> implements SecondActivityContract.Presenter {

    @Override
    public void doSomeWork() {
        if(isViewAttached()){
            getView().showSomething();
        }
    }
}
