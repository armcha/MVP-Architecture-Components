package com.luseen.basearch.main.secondActivity;

import com.luseen.arch.BaseAnnotatedActivity;
import com.luseen.arch.Viewable;
import com.luseen.basearch.R;
import com.luseen.basearch.main.second_fragment.SecondFragment;

@Viewable(presenter = SecondActivityPresenter.class, layout = R.layout.activity_second)
public class SecondActivity extends BaseAnnotatedActivity<SecondActivityContract.View, SecondActivityContract.Presenter>
        implements SecondActivityContract.View {

    @Override
    public void openDetailFragment() {
        if (getSupportFragmentManager().findFragmentById(R.id.container) == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, new SecondFragment())
                    .commit();
        }
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError(String errorMessage) {

    }
}
