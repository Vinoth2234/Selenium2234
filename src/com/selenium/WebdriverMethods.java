package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VINOTHKUMAR\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jiomart.com/");
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		String Title =driver.getTitle();
		System.out.println(Title);
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		driver.navigate().to("https://www.jiomart.com/p/groceries/mirinda-orange-2-25-l/490004177");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.quit();
	}

}
