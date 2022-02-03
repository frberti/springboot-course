package com.francisco.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    private static final long SerialVersionuID = 1L;

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id " + id);
    }

}
