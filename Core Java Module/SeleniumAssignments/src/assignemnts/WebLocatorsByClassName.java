package assignemnts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLocatorsByClassName {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://temp-mail.org/en/");
		driver.findElement(By.className("goPremiumBtn")).click();
	}

}
