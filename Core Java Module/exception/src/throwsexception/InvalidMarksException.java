package throwsexception;

public class InvalidMarksException extends Exception {


	@Override
	public String toString() {
		return "Dont Enter 0 and 100 marks";
	}

}
