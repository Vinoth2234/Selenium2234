package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Open Orange:
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button [@type='submit']"));
		Thread.sleep(3000);
		WebElement Admin = driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]"));
		Admin.click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		
		WebElement Multiples = driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active oxd-select-text--error']"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scroll(0,800)");
//		Select S =new Select(Multiples);
//		boolean multiples = S.isMultiple();
//		System.out.println(multiples);
//		Thread.sleep(2000);
//		S.selectByIndex(1);
//		Thread.sleep(2000);
//		S.selectByValue("Admin");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).("Vinoth");
		//driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")).sendKeys("Vinoth");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).("Vinoth@123");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).("Vinoth@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).("Bob Jawaharlal Tester");
		org.openqa.selenium.interactions.Actions s=new org.openqa.selenium.interactions. Actions (driver);
		WebElement findElement = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		s.sendKeys(Keys.ENTER).perform();
		//driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();
		WebDriverWait Wait = new WebDriverWait(driver,30);
		Wait.until(ExpectedConditions.elementToBeClickable(Admin));
		
		
		
		
		
		
		
		
		
		
		
		
	//	WebElement dropdown = driver.findElement(By.xpath("//div [text()='ESS']"));

		
		//		Select S =new Select(dropdown);
//		//Thread.sleep(2000);
//		List<WebElement> options = S.getOptions();
//		for (WebElement All : options) {
//			System.out.println(All.getText());
	}
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		

	}

