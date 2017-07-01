package com.luseen.arch;

/**
 * Created by Chatikyan on 01.07.2017.
 */

public class MvpException extends Exception {

    public MvpException(String message) {
        super(message);
    }

    public MvpException(String message, Throwable cause) {
        super(message, cause);
    }

    public MvpException(Throwable cause) {
        super(cause);
    }

    public MvpException() {
        super();
    }
}
