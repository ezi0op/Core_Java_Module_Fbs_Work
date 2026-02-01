package p1;

import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter f1 =  new FileWriter("demo.txt",true);
			f1.write("Good Morning!!!"); 
			f1.close();
			System.out.println("Written successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
