package org.stevew.exceptions;

/**
 * Created by esteban on 18/02/15.
 */
public class UserNotFoundException extends Exception {
    public UserNotFoundException(String msg) {
        super(msg);
    }
}
