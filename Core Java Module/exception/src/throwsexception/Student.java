package throwsexception;

public class Student {
	int id;
	String name;
	int marks;
	Student(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public void grade(int mark) throws InvalidMarksException {
		if(mark<0&&mark>100) {
			throw new InvalidMarksException();
		}else {
		    if (mark < 35) {
	            System.out.println("Fail");
	        } else if (mark >= 35 && mark < 50) {
	            System.out.println("Pass Class");
	        } else if (mark >= 50 && mark < 60) {
	            System.out.println("Second Class");
	        } else if (mark >= 60 && mark < 75) {
	            System.out.println("First Class");
	        } else {
	            System.out.println("Distinction");
	        }
	}
	}
}