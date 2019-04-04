package fr.simplon.addressBook.exceptions;

public class FileException extends RuntimeException{
	
	   /**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	public FileException() {
			super();
		    }

		    public FileException(String error, Throwable why) {
			super(error, why);
		    }

}
