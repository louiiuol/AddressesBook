package fr.simplon.addressBook.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class CustumExceptionControllerAdvice {
	
	@ExceptionHandler(FileException.class)
	@ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public void handleFileErrorException() {
    }
}