package throwsexception;

public class Voter {
	int age;

	Voter(int age) {
		this.age = age;
	}

	public void validate() throws InvalidAgeException {
		if (this.age < 18) {

			throw new InvalidAgeException();

		} else {
			System.out.println("You can vote");
		}

	}

}
