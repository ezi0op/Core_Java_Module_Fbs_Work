package fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader f = null;

		try {
			f = new FileReader("C:\\users\\itspa\\FirstBitSolutions\\Java Module\\FileReaderWriter\\myFile.txt");

			char ch;
//			int var;
//
//			ch = (char) var;
//
//			do {
//				System.out.printf("%c", ch);
//				var = f.read();
//				ch = (char) var;
//			} while (var != -1);
//			f.close();
			while (((ch = (char) f.read()) != 36)) {
				System.out.printf("%c", ch);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			f.close();
			System.out.println("File Closed...");
		}

	}

}
