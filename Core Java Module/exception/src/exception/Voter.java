package exception;

public class Voter {
	int age;

	Voter(int age) {
		this.age = age;
	}

	public void validate() {
		if (this.age < 18) {
			try {
				throw new InvalidAgeException();
			} catch (InvalidAgeException iae) {
				System.out.println(iae);
			}
		} else {
			System.out.println("You can vote");
		}

	}

}
