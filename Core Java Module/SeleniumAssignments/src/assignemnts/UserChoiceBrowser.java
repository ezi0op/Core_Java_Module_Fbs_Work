package assignemnts;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserChoiceBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter \n 1.Chrome \n 2.Edge \n 3.FireFox");

		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			UserChoiceBrowser.chrome();
			break;
		case 3:
			UserChoiceBrowser.edge();
			break;
		case 2:
			UserChoiceBrowser.firefox();
			break;

		default:
			break;
		}

	}

	static void chrome() {
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");
	}

	static void edge() {
		WebDriver driver = new EdgeDriver();

		driver.get("http://www.google.com");

	}

	static void firefox() {
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.google.com");

	}
}
