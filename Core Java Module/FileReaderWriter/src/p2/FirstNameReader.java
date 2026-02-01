package p2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FirstNameReader extends Thread {

	@Override
	public void run() {
		
		try {
			BufferedReader b1 = new BufferedReader(new FileReader("firstname.txt"));
			String fname = null;
			while ((fname = b1.readLine()) != null) {
				System.out.println(fname);
				;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
