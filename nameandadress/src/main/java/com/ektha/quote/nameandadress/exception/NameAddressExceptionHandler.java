/**
 * 
 */
package com.ektha.quote.nameandadress.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author AsimSubedi
 *
 */

@ControllerAdvice
public class NameAddressExceptionHandler {

	@ExceptionHandler(value = NameAddressNotFoundException.class)
	public ResponseEntity<Object> exception(NameAddressNotFoundException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}

}
