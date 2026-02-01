package assignemnts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLocatorsById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/register");
		WebElement usn = driver.findElement(By.id("username"));
		usn.sendKeys("Amit");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("AJAY");
		WebElement conp = driver.findElement(By.id("confirmPassword"));
		conp.sendKeys("AJAY");
	}

}
