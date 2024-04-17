package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VINOTHKUMAR\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jiomart.com/");
		WebElement Search = driver.findElement(By.id("autocomplete-0-input"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", Search);
		Thread.sleep(3000);
		js.executeScript("window.scroll(0,0)");
		Thread.sleep(3000);
		js.executeScript("window.scroll(0,800)");
		Thread.sleep(3000);
		js.executeScript("window.scroll(0,-500)");
		WebElement findElement = driver.findElement(By.id("nav_link_2"));
	    js.executeScript("arguments[0].click();", findElement);
		Dimension size = driver.manage().window().getSize();
		System.out.print(size);
		driver.quit();

	}

}
