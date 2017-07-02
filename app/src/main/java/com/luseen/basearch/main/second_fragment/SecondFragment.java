package com.luseen.basearch.main.second_fragment;


import android.util.Log;

import com.luseen.arch.BaseAnnotatedFragment;
import com.luseen.arch.Viewable;
import com.luseen.basearch.R;

@Viewable(presenter = SecondFragmentPresenter.class, layout = R.layout.fragment_second)
public class SecondFragment extends BaseAnnotatedFragment<SecondFragmentContract.View, SecondFragmentContract.Presenter>
        implements SecondFragmentContract.View {

    @Override
    public void showSomething() {
        Log.e("showSomething ", "SomethingShowed");
    }
}
