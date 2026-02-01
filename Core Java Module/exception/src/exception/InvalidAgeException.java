package exception;

public class InvalidAgeException extends Exception {

	@Override
	public String toString() {
		return "Invalid age,You cant WAIT";
	}

}
