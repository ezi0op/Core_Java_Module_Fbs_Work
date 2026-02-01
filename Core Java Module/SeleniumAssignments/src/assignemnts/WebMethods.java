package assignemnts;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter \n 1.Chrome \n 2.Edge \n 3.FireFox");

		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			WebDriver driver = new ChromeDriver();

			driver.get("http://www.google.com");
			System.out.println("Google Page Source :" + driver.getPageSource());
			System.out.println("Url : " + driver.getCurrentUrl());
			System.out.println("Title :" + driver.getTitle());
			driver.close();
			break;
		case 3:
			WebDriver driver1 = new EdgeDriver();

			driver1.get("http://www.google.com");

			System.out.println("Google Page Source :" + driver1.getPageSource());
			System.out.println("Url : " + driver1.getCurrentUrl());
			System.out.println("Title :" + driver1.getTitle());
			driver1.close();
			break;
		case 2:
			WebDriver driver2 = new FirefoxDriver();

			driver2.get("http://www.google.com");

			System.out.println("Google Page Source :" + driver2.getPageSource());
			System.out.println("Url : " + driver2.getCurrentUrl());
			System.out.println("Title :" + driver2.getTitle());
			driver2.close();
			break;

		default:
			break;
		}

	}


}
