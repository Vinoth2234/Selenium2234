package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element_Method1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VINOTHKUMAR\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jiomart.com/");
		WebElement Search = driver.findElement(By.id("autocomplete-0-input"));
		Search.sendKeys("mobiles");
		//Search.submit();
	boolean displayed = Search.isDisplayed();
	System.out.println(displayed);
	boolean enabled = Search.isEnabled();
	System.out.println(enabled);
	boolean selected = Search.isSelected();
	System.out.println(selected);
	driver.quit();
	driver.close();

}
}