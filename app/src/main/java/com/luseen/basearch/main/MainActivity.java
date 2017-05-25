package com.luseen.basearch.main;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.luseen.basearch.R;
import com.luseen.basearch.base.BaseActivity;

public class MainActivity extends BaseActivity<MainActivityContract.View, MainActivityContract.Presenter>
        implements MainActivityContract.View, View.OnClickListener {

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);

        progressDialog = createProgressDialog(this);
    }

    private ProgressDialog createProgressDialog(Context context) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Loading");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setCancelable(false);
        progressDialog.setProgress(0);
        return progressDialog;
    }

    @Override
    protected MainActivityContract.Presenter initPresenter() {
        return new MainActivityPresenter();
    }

    @Override
    public void onClick(View v) {
        presenter.doSomethingAfterDelay(15_000L);
    }

    @Override
    public void showProgress() {
        progressDialog.show();
    }

    @Override
    public void hideProgress() {
        progressDialog.dismiss();
    }

    @Override
    public void updateProgressPercentage(int percent) {
        progressDialog.setProgress(percent);
    }
}
