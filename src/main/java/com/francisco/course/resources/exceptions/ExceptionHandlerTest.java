package com.francisco.course.resources.exceptions;

import com.francisco.course.services.exceptions.ExceptionTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ExceptionHandlerTest {

    @ExceptionHandler(ExceptionTest.class)
    public ResponseEntity<StandardErrorTest> errorTest(ExceptionTest e, HttpServletRequest request){
        String error = "Exception test";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardErrorTest err = new StandardErrorTest(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

}
