package com.luseen.arch;


import android.arch.lifecycle.Lifecycle;
import android.os.Bundle;

/**
 * Created by Chatikyan on 20.05.2017.
 */

public interface BaseContract {

    interface View {

    }

    interface Presenter<V extends BaseContract.View> {

        Bundle getStateBundle();

        void attachLifecycle(Lifecycle lifecycle);

        void detachLifecycle(Lifecycle lifecycle);

        void attachView(V view);

        void detachView();

        V getView();

        boolean isViewAttached();

        void onPresenterCreated();

        void onPresenterDestroy();
    }
}
