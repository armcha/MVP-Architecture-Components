package com.luseen.arch;

import android.util.Log;

/**
 * Created by Chatikyan on 29.06.2017.
 */

class AnnotationHelper {

    static BaseContract.Presenter createPresenter(Class<? extends BaseAnnotatedActivity> annotatedClass) {
        try {
            return annotatedClass.getAnnotation(View.class).presenter().newInstance();
        } catch (InstantiationException e) {
            Log.e(Constants.TAG, e.getMessage());
        } catch (IllegalAccessException e) {
            Log.e(Constants.TAG, e.getMessage());
        }
        Log.e(Constants.TAG, "Can't access to presenter class -" + annotatedClass.getName());
        return null;
    }
}
