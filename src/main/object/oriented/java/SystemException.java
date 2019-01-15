/**
 * 
 */
package object.oriented.java;

public class SystemException extends Exception {

	private int errorCode;

	public SystemException(String message, int errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

}
