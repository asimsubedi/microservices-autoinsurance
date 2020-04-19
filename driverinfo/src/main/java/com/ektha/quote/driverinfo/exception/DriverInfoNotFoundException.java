/**
 * 
 */
package com.ektha.quote.driverinfo.exception;

/**
 * @author AsimSubedi
 *
 */
public class DriverInfoNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 8597776741145082639L;

	@Override
	public String getMessage() {
		return "Driver Info Not Found!";
	}

}
