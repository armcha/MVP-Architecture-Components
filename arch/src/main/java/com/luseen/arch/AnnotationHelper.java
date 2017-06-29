package com.luseen.arch;

/**
 * Created by Chatikyan on 29.06.2017.
 */

class AnnotationHelper {

    static BaseContract.Presenter createPresenter(Class<? extends BaseAnnotatedActivity> annotatedClass){
        try {
            return annotatedClass.getAnnotation(View.class).presenter().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        // TODO: 29.06.2017 Log error
        return null;
    }
}
