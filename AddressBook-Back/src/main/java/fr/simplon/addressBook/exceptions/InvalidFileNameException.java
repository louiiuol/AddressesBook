package fr.simplon.addressBook.exceptions;
/**
 * 
 * <h4> This class defines a specific {@code RuntimeException}: The file name is not valid or is not reachable.</h4>
 *  
 * @see RuntimeException
*/
public class InvalidFileNameException extends RuntimeException{
	
	private static final long serialVersionUID = -7052787985628874037L;

	public InvalidFileNameException(String error) { super(error); }

	public InvalidFileNameException(String error, Throwable why) { super(error, why); }
	
}
