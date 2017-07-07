package com.luseen.arch;

/**
 * Created by Chatikyan on 07.07.2017.
 */

public interface BaseLoadingContract {

    interface View extends BaseContract.View {

        void showLoading();

        void hideLoading();

        void showError(String errorMessage);
    }

    interface Presenter extends BaseContract.Presenter<View> {

    }

}
