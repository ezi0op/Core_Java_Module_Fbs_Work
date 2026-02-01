package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingByName {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Amit");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("lno");
	}
}
