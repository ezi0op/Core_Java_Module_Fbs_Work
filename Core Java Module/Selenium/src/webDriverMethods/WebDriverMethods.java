package webDriverMethods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.get("http://www.google.com");
		System.out.println("PageSource of Google Website :"+driver.getPageSource());
		System.out.println("\n");
		System.out.println("Title of Google Website :"+driver.getTitle());
		System.out.println("\n");
		System.out.println("Url of Google WEBSite :"+driver.getCurrentUrl());
		driver.close();
	}

}
