package com.luseen.basearch.main.second_fragment;

import com.luseen.arch.BaseContract;
import com.luseen.basearch.main.fragment.DetailContract;

/**
 * Created by Chatikyan on 01.07.2017.
 */

public interface SecondFragmentContract {

    interface View extends BaseContract.View{
        void showSomething();
    }

    interface Presenter extends BaseContract.Presenter<View>{
        void doSomeWork();
    }
}
