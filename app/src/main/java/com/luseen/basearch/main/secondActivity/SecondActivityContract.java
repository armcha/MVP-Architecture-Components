package com.luseen.basearch.main.secondActivity;

import com.luseen.arch.BaseContract;

/**
 * Created by Chatikyan on 29.06.2017.
 */

public interface SecondActivityContract {

    interface View extends BaseContract.View{
        void openDetailFragment();
    }

    interface Presenter extends BaseContract.Presenter<View>{

    }
}
