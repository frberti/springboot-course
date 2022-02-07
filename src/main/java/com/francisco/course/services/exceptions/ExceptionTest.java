package com.francisco.course.services.exceptions;

public class ExceptionTest extends RuntimeException{
    private static final long SerialVersionUID = 1L;

    public ExceptionTest (Object id){
        super("Exception test. Id " + id);
    }
}
