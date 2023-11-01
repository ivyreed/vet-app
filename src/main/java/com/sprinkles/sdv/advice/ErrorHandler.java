package com.sprinkles.sdv.advice;

import com.sprinkles.sdv.datatransferobject.ErrorDTO;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(RuntimeException.class)
    public ErrorDTO handleInternalError(RuntimeException e) {
        return new ErrorDTO("Encountered a burnt bean");
    }

}
