import java.util.Scanner;
class Time {	
	
	int hr,min,sec;
		
	Time(int a,int b,int c){
	this.hr=a;
	this.min=b;
	this.sec=c;
	}
	
	void formatTime(){
	int tsec = hr*3600+min*60+sec;
	
	hr=(tsec/3600)%24;
	int m = tsec%3600;
	min=m/60;
	sec=m%60;
	}
	
	void add(Time t){
	this.hr=this.hr+t.hr;
	this.min=this.min+t.min;
	this.sec=this.sec+t.sec;
	formatTime();
	}
	
	void add(int g){	
	this.hr = this.sec+g;
	formatTime();
	}


	void display(){
	System.out.println("Time details !");
	System.out.println(hr+":"+min+":"+sec);
	}
	
}
	
class TestTime{	
	
	public static void main(String[] a){	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Hours :");
	int d = sc.nextInt();
	
	System.out.println("Enter Min :");
	int b = sc.nextInt();
	
	System.out.println("Enter Sec :");
	int c = sc.nextInt();
	
	Time t1 = new Time(d,b,c);
	t1.display();

	
	Time t2 = new Time(d,b,c);
	t2.display();
	
	t1.add(t2);
	t1.display();
	
	System.out.println("Enter Extra Seconds : ");
	int f = sc.nextInt();
	t1.add(f);
	t1.display();
	
	}	

	
}