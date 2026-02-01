package file;

import java.io.File;
import java.io.IOException;

public class MainApp {
	public static void main(String[] args) {
		File myFile = new File(
				"C:\\Users\\itspa\\FirstBitSolutions\\Java Module\\FileHandling\\src\\file\\myText.txt");
		System.out.println("File found or not found : " + myFile.exists());

		try {
			System.out.println("File Creation Status : " + myFile.createNewFile());
			System.out.println("File found or not found : " + myFile.exists());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Unable to create file.");
		} finally {
			if (myFile.exists() == true) {
				myFile.delete();
				System.out.println("File deleted SuccessFully!...");
			} else {
				System.out.println("This file not found");
			}
		}

		System.out.println("File found or not found : " + myFile.exists());
	}
}
