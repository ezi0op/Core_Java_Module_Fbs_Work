package p1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int roll;
	String name;
	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
}


public class Test {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("myDat.txt");
			DataInputStream dis = new DataInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(dis);
			Student s1=(Student) ois.readObject();
			System.out.println(s1);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main1(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("myDat.txt");
//			DataOutputStream dos =  new DataOutputStream(fos);
			ObjectOutputStream ods = new ObjectOutputStream(fos);
			ods.writeObject(new Student(10,"Amit"));
			System.out.println("Writtent Successfully!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}//Write main 
}
