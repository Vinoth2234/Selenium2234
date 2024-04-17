package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VINOTHKUMAR\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jiomart.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File ("C:\\Users\\VINOTHKUMAR\\eclipse-workspace\\Selenium_project\\Screenshot\\jiomart.png");
		FileUtils.copyFile(Source, destination);
		

	}

}
