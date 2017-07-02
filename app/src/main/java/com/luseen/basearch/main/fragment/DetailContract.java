package com.luseen.basearch.main.fragment;

import com.luseen.arch.BaseContract;
import com.luseen.basearch.main.secondActivity.SecondActivityContract;

/**
 * Created by Chatikyan on 01.07.2017.
 */

public interface DetailContract {

    interface View extends BaseContract.View{
        void showSomething();
    }

    interface Presenter extends BaseContract.Presenter<DetailContract.View>{
        void doSomeWork();
    }
}
