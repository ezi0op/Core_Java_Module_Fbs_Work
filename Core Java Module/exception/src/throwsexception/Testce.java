package throwsexception;

public class Testce {

	public static void main(String[] args) {
		Voter v = new Voter(18);
		try {
			v.validate();
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}
	}

//	public static void main(String[] args) {
//		Student s =  new Student(101,"Amit");
//		try {
//			s.grade(0);
//		}catch(InvalidMarksException e) {
//			System.out.println(e);
//		}
//	}
//	public static void main(String[] args) {
//		Employee e = new Employee(34, "Amit", 0);
//		try {
//			e.ValSal();
//		} catch (InvalidSalException a) {
//			System.out.println(a);
//		}
//	}
}
