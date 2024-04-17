package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Handle {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Open Flipkart:
		driver.get("https://www.flipkart.com/");
		
		//Search vivo mobiles 5g:
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("vivo mobiles 5g",Keys.ENTER);
		
		//Enter Preffered Mobile:
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		Thread.sleep(4000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> in =new ArrayList<>(windowHandles);
		System.out.println(windowHandles);
		driver.switchTo().window(in.get(1));	
		org.openqa.selenium.interactions.Actions Move=new org.openqa.selenium.interactions. Actions (driver); 
		
		//Xpath for Video:
		WebElement VideoElement = driver.findElement(By.xpath("//div[@class='_2usHgU']"));
		Move.moveToElement(VideoElement).perform();
		
		//Xpath for Video Frame:
		WebElement VideoFrame = driver.findElement(By.xpath("//iframe[@class='_1JqCrR']"));
	    driver.switchTo().frame(VideoFrame);
	    
	    //used implicitWait because of noSuchElemet Exception:
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    //Xpath for Video PlayButton:
	    WebElement PlayButton = driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
	    PlayButton.click();
	    Thread.sleep(10000);
	    
	    //Used keyboard action for pause:
	    Robot r= new Robot();
	    r.keyPress(KeyEvent.VK_K);
	    r.keyRelease(KeyEvent.VK_K);
	    Thread.sleep(10000);
	    driver.quit();
		}
		}


