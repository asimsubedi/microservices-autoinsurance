/**
 * 
 */
package com.ektha.quote.driverinfo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author AsimSubedi
 *
 */

@ControllerAdvice
public class DriverInfoExceptionHandler {

	@ExceptionHandler(value = DriverInfoNotFoundException.class)
	public ResponseEntity<Object> exception(DriverInfoNotFoundException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}

}
