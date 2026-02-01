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
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Rollno :");
	int p = sc.nextInt();
	sc.nextLine();	
	
	System.out.println("Enter Name :");
	String q = sc.nextLine();

	System.out.println("Enter Mark :");
	int r =  sc.nextInt();

	
	Student[] s =  new Student[2];
	s[0] = new Student();
	s[1] = new Student(p,q,r);
	
	for(int i=0;i<s.length;i++){
	s[i].display();
	}
	

	}//main ends here

}//testStudent class ends here