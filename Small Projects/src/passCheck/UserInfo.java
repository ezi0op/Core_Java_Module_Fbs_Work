package passCheck;

public class UserInfo {
	String uName = "admin";
	int pass = 1234;

	void validateUname(String u) throws InvalidUserNameException {
		if (!u.equals(uName)) {
			throw new InvalidUserNameException();
		} else {
			System.out.println("UserName Valid");
		}

	}

	void validatePass(int p) throws InvalidPassWorsException {
		if (p != pass) {
			throw new InvalidPassWorsException();
		} else {
			System.out.println("Pass Valid");
		}
	}
}
