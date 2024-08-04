package org.snapdeal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avila Theresa\\Desktop\\Java Selenium Course\\selenium\\Ss\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		
		WebElement email = driver.findElement(By.xpath("(//input[contains(@type='text')])[1]"));
		email.sendKeys("minz.jema@gmail.com");
		
		
		
	}	
		
	}