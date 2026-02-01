import java.util.Scanner;

class Student{
	int rollno;
	String name;
	int mark;
	
	Student(){//Default Constuctor
	System.out.println("Constuctor Called");
	this.rollno=324;
	this.name="Amit";
	this.mark=234234;
	
	}
		
	Student(int a,String b,int c){//Parameterized Constuctor
	System.out.println("Parameter Constuctor Called");
	this.rollno=a;
	this.name=b;
	this.mark=c;
	}

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
	
	Student s3;
	s3 = new Student();
	s3.display();
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Rollno :");
	int a = nextInt();
		
	System.out.println("Enter Name :");
	String b = nextLine();

	System.out.println("Enter Mark :");
	int c =  nextInt();

	
	Student s4;
	s4 = new Student(a,b,c);
	s4.display();
	
		
	if(s1.mark>s2.mark){
	System.out.println("S1 has Higher Marks");
	}else{
	System.out.println("S2 has Higher Marks");
	}

	}//main ends here

}//testStudent class ends here