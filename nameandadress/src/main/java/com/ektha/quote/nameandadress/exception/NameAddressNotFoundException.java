/**
 * 
 */
package com.ektha.quote.nameandadress.exception;

/**
 * @author AsimSubedi
 *
 */
public class NameAddressNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 8597776741145082639L;

	@Override
	public String getMessage() {
		return "Name Address Not Found!";
	}

}
