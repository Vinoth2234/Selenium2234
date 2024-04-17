package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mini_Project {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//Open Orange:
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//login 
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		String ID = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p'][1]")).getText();
		String username = ID.substring(11);
		driver.findElement(By.name("username")).sendKeys(username);
		String Password = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p'][2]")).getText();
		String pwd = Password.substring(11);
		driver.findElement(By.name("password")).sendKeys(pwd);
//enter login
		driver.findElement(By.xpath("//button [@type='submit']")).click();
//click admin:
		WebElement Admin = driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]"));
		Admin.click();
		org.openqa.selenium.interactions.Actions s=new org.openqa.selenium.interactions. Actions (driver);
//xpath for add user button:
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();	
//xpath for enter password:
	    driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Vinoth@123");
	    driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Vinoth@123");
	    //xpath for username:
	    driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Vinothkumar");
	    //xpath for  status & keyboardaction;
        driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		s.sendKeys(Keys.ENTER).perform();
		//xpath for userole & keyboardaction:
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		s.sendKeys(Keys.ENTER).perform();
		//xpath for employee name:
	
		String name = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).getText();
		
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(name);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		s.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		Thread.sleep(6000);
		//xpath for system user content:
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		s.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		s.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Vinothkumar");
		Thread.sleep(4000);
		//xpath for search button:
		WebElement enter = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
		enter.click();
		driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[1]")).click();
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.close();
	}
	
	
	
}

