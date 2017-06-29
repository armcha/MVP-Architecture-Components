package com.luseen.arch;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Chatikyan on 29.06.2017.
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface View {

    int LAYOUT_NOT_DEFINED = -1;

    Class<? extends BasePresenter> presenter();

    int layout() default LAYOUT_NOT_DEFINED;
}
