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
	int getRollNo(){
	return this.rollno;
	}
	String getName(){
	return this.name;
	}
	int getMark(){
	return this.mark;
	}

	void display(){
	System.out.println("RollNo is "+this.rollno);
	System.out.println("Name is "+this.name);
	System.out.println("Marks are "+this.mark);
	}

}//Student class ends here
class TestStudent{
	public static void main(String[] a){
	Student s1;
	s1 = new Student();
	s1.setRollno(12);
	s1.setName("Amit");
	s1.setMark(23);
	s1.display();
	
	Student s2;
	s2 = new Student();
	s2.setRollno(14);
	s2.setName("Anna");
	s2.setMark(27);
	s2.display();
		
	if(s1.mark>s2.mark){
	System.out.println("S1 has Higher Marks");
	}else{
	System.out.println("S2 has Higher Marks");
	}

	}//main ends here

}//testStudent class ends here