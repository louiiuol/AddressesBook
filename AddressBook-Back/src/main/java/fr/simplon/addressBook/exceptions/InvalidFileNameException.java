package fr.simplon.addressBook.exceptions;

public class InvalidFileNameException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7052787985628874037L;

	public InvalidFileNameException(String error, Throwable why) {
		super(error, why);
	}
	
}
