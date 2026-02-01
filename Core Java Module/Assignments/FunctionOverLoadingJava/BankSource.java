class Student {
	
	int rollno;
	String name;
	double percentage;
	
	
	Student(int a,String s,double b){//Parameterized constructor	
	System.out.println("Parameterized constructor");
	this.rollno=a;
	this.name=s;
	this.percentage=b;
	}
	
	void display(){
	System.out.println("Student details !");
	System.out.println("Roll no :"+this.rollno);
	System.out.println("Name :"+this.name);
	System.out.println("Percentage :"+this.percentage);
	}
	
}//Student class ends here

class Employee {
	
	int id;
	String name;
	double annualSalary;	
	
	Employee(int a,String s,double b){//Parameterized constructor	
	System.out.println("Parameterized constructor");
	this.id=a;
	this.name=s;
	this.annualSalary=b;
	}
	
	void display(){
	System.out.println("Employee details !");
	System.out.println("ID :"+this.id);
	System.out.println("Name :"+this.name);
	System.out.println("Annual Salary :"+this.annualSalary);
	}
	
}//Student class ends here
	
class TestBank{	
	
	
	
	public static void main(String[] a){	
		
	Student s1;
	s1 = new Student(23,"jay",21);	
	s1.display();
	

	if(s1.percentage>80){	
	System.out.println("2 lakh");
	}else if(s1.percentage>=60 && s1.percentage<=80){	
	System.out.println("1 lakh");
	}else if(s1.percentage>=40 && s1.percentage<=60){	
	System.out.println("50k");
	}else{	
	System.out.println("No loan approved");
	}

	
	Employee e1;
	e1 = new Employee(23,"Anna",32);
	e1.display();
	
	if(e1.annualSalary>12){	
	System.out.println("7 lakh");
	}else if(e1.annualSalary>=10 && e1.annualSalary<=12){	
	System.out.println("6 lakh");
	}else if(e1.annualSalary>=6 && e1.annualSalary<=10){	
	System.out.println("5 lakh");
	}else if(e1.annualSalary>=4 && e1.annualSalary<=6){	
	System.out.println("4 lakh");
	}else{	
	System.out.println("No loan approved");
	}

	

	}

	
	

	
}//Bank class ends here
	

	

	
