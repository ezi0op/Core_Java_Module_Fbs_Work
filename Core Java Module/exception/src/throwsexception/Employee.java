package throwsexception;

public class Employee {
	int id;
	String name;
	double sal;

	Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	void ValSal() throws InvalidSalException {
		if (this.sal < 5000) {
			throw new InvalidSalException();
		} else {
			System.out.println("crct Salary");
		}
	}

}
