package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VINOTHKUMAR\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		String text = driver.findElement(By.xpath("//button[@onclick='myFunction()']")).getText();
		String substring = text.substring(2, 4);
		System.out.println(text);
		System.out.println(substring);
//		String text = driver.switchTo().alert().getText();
//		System.out.println(text);
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().dismiss();
//		driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
		driver.quit();
		
	}

}
