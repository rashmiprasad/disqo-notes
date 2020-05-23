package com.disqo.exception;

/**
 * Created by rashmiprasad on 5/21/20.
 */
public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 266853955330077478L;

    public ResourceNotFoundException(String exception) {
        super(exception);
    }

}
