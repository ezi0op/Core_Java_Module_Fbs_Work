package fileWriter;

import java.io.*;

public class MainApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter f = null;

		try {
			f = new FileWriter("C:\\users\\itspa\\FirstBitSolutions\\Java Module\\FileReaderWriter\\myFile.txt");

			String data = "Hello Java FileWriter$";

			for (int i = 0; i < data.length(); i++) {
				char ch = data.charAt(i);

				if (ch == '$') {
					break;
				}
				f.write(ch);
			}

			System.out.println("Data Written Successfully...");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {

			f.close();
			System.out.println("File Closed...");

		}
	}
}
