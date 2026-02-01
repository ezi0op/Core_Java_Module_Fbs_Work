package p2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

class Printer {

	String fname;
	String lname;

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	synchronized void printFulName(String str, boolean isFirst) {
		
		   if (isFirst) {
	            fname = str;
	        } else {
	            lname = str;
	        }
		   
		System.out.println(this.fname+" "+this.lname);
	}
}

public class Test {

	
	static Printer Printer = new Printer();

	public static void main(String[] args) {

		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					BufferedReader b1 = new BufferedReader(new FileReader("firstname.txt"));
					String fname = null;
					while ((fname = b1.readLine()) != null) {
//						System.out.println(fname);
						Printer.printFulName(fname, true);
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					BufferedReader b2 = new BufferedReader(new FileReader("lastname.txt"));
					String lname = null;
					while ((lname = b2.readLine()) != null) {
//						System.out.println(lname);
						Printer.printFulName(lname, false);

					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
	}

}
