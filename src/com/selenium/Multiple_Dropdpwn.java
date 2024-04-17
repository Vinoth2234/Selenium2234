package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdpwn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VINOTHKUMAR\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement Multiple = driver.findElement(By.id("colors"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,800)");
		Select S =new Select(Multiple);
		boolean multiples = S.isMultiple();
		System.out.println(multiples);
		Thread.sleep(2000);
		S.selectByIndex(1);
		Thread.sleep(2000);
		S.selectByValue("green");
		Thread.sleep(2000);
		S.selectByVisibleText("White");
		List<WebElement> options = S.getOptions();
		for (WebElement All : options) {
			System.out.println(All.getText());
			
		}
			
		List<WebElement> allSelectedOptions = S.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println("allSelectedOptions: "+webElement.getText());
			
		}
		S.getFirstSelectedOption();
		S.deselectByIndex(1);
		S.deselectByValue("green");
		S.deselectAll();
		driver.quit();
		
		

	}

}
