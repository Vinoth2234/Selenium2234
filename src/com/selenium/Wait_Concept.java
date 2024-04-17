package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Concept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VINOTHKUMAR\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Implicit Wait:
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		WebElement Element = driver.findElement(By.xpath("//button [@type='submit']"));
	
		//Explicit Wait:
		WebDriverWait Wait = new WebDriverWait(driver,30);
		Wait.until(ExpectedConditions.visibilityOf(Element));
		Element.click();
		driver.quit();

	}

}
