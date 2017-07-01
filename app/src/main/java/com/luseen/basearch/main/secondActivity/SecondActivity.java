package com.luseen.basearch.main.secondActivity;

import android.os.Bundle;
import android.util.Log;

import com.luseen.arch.BaseAnnotatedActivity;
import com.luseen.arch.View;
import com.luseen.basearch.R;

@View(presenter = SecondActivityPresenter.class, layout = R.layout.activity_second)
public class SecondActivity extends BaseAnnotatedActivity<SecondActivityContract.View, SecondActivityContract.Presenter>
        implements SecondActivityContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter.doSomeWork();
    }

    @Override
    public void showSomething() {
        Log.e("showSomething ", "showSomething");
    }
}
