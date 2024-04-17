package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element_Method2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver"
				,"C:\\Users\\VINOTHKUMAR\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("laptops");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
		WebElement Text = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
		System.out.println("Name:"+ Text.getText() );
		List<WebElement> AllText = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for (WebElement WebElement:AllText) {
			System.out.println(WebElement.getText());
		}
		driver.quit();
		
	

	}

}
