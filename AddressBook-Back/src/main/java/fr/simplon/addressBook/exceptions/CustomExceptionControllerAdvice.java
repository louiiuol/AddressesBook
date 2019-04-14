package fr.simplon.addressBook.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * 
 * <h4> This class defines how to handle different exceptions, and specifies status for the controller endpoints:</h4>
 * <ul>
 * <li> {@link InvalidFileNameException} <i>I_AM_A_TEAPOT</i></li>
 *  </ul>
 * <hr/>
 * @see HttpStatus
 * @see RestControllerAdvice
 * @see ResponseEntityExceptionHandler
 * 
*/
@RestControllerAdvice
public class CustomExceptionControllerAdvice extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(InvalidFileNameException.class)
  public ResponseEntity<Object> invalidFileNameException(InvalidFileNameException e) {
		return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).body("The file name is not valid or is not reachable.");
  }
  
}