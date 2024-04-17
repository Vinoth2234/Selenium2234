package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
	
	    WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,800)");
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.name("RESULT_TextField-0")).sendKeys("Vinoth");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@ for='RESULT_RadioButton-1_0']")).click();
		driver.findElement(By.name("RESULT_TextField-2")).sendKeys("27.01.1999");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("RESULT_RadioButton-3"));
		Select s=new Select(element);
		s.selectByValue("Radio-2");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
	}

}
