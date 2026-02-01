class Student{
	int rollno;
	String name;
	int mark;

	void setRollno(int a){
	rollno=a;
	}
	void setName(String b){
	name=b;
	}
	void setMark(int c){
	mark=c;
	}

}//Student class ends here
class testStudent{
	public static void main(String[] a){
	Student s1;
	s1 = new Student();
	s1.setRollno(12);
	s1.setName("Amit");
	s1.setMark(23);
	System.out.println("Student Details : Rollno "+s1.rollno+"Name :"+s1.name+" Mark :"+s1.mark);
	}//main ends here

}//testStudent class ends here