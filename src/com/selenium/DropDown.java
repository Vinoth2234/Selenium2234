package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\VINOTHKUMAR\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
//			WebDriver driver=new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://letcode.in/dropdowns");
//			WebElement Single = driver.findElement(By.id("fruits"));
//			Select S =new Select(Single);
//			Thread.sleep(2000);
//			S.selectByIndex(2);
//			Thread.sleep(2000);
//			S.selectByValue("3");
//			Thread.sleep(2000);
//			S.selectByVisibleText("Pine Apple");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VINOTHKUMAR\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSystemUser");
		WebElement Single = driver.findElement(By.xpath("//div[text()='Admin']"));
		Select S =new Select(Single);
		Thread.sleep(2000);
		S.selectByIndex(1);
		Thread.sleep(2000);
		S.selectByValue("Admin");
		Thread.sleep(2000);
		//S.selectByVisibleText("Pine Apple");
			
			
			

	}

}
