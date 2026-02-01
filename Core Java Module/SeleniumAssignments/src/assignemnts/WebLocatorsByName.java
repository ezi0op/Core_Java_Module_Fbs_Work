package assignemnts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLocatorsByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement usn = driver.findElement(By.name("login"));
		usn.sendKeys("alsd");
		WebElement pass = driver.findElement(By.name("passwd"));
		pass.sendKeys("asd");
	}

}
