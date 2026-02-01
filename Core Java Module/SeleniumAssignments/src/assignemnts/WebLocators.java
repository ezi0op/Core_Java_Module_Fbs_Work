package assignemnts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demoqa.com/automation-practice-form");
//		driver.findElement(By.id("firstName")).sendKeys("Amit");
//		driver.findElement(By.id("lastName")).sendKeys("Birajdar");
//		driver.findElement(By.id("userEmail")).sendKeys("Amit@gmial.ocm");
//		driver.get("https://en.wikipedia.org/wiki/MS_Dhoni");
//		driver.findElement(By.linkText("limited overs")).click();
//		driver.findElement(By.partialLinkText("2013")).click();
		driver.get("https://auth.wikimedia.org/enwiki/wiki/Special:UserLogin?useformat=desktop&usesul3=1&returnto=MS+Dhoni&centralauthLoginToken=44da345dc4f55838806aeff5c6320f79");
		driver.findElement(By.className("wploginattempt")).click();
		

	}

}
