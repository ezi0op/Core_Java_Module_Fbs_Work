package throwsexception;

public class InvalidSalException extends Exception {

	@Override
	public String toString() {
		return "Invalid Salary!";
	}

}
