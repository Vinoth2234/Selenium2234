package com.selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Actionss {
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//DragDrop:
		org.openqa.selenium.interactions.Actions s=new org.openqa.selenium.interactions. Actions (driver); 
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		s.dragAndDrop(drag, drop).build().perform();
		
		//click:
		WebElement Click = driver.findElement(By.id("male"));
		s.click(Click).perform();
		
		//DoubleClick:
		WebElement DoubleClick = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		s.doubleClick(DoubleClick).perform();
		
		//moveToElement,contextClick:
		driver.navigate().to("https://www.myntra.com/");
		WebElement Mouse = driver.findElement(By.xpath("//a[text()='Men']"));
		s.moveToElement(Mouse).perform();
		Thread.sleep(3000);
		s.contextClick(Mouse).perform();
		Thread.sleep(3000);
		
		//KeyBoardBasedAction:
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		s.sendKeys(Keys.ENTER).perform();	
		Thread.sleep(5000);
		//driver.close();
		}
}
