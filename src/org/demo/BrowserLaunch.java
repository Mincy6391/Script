package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avila Theresa\\Desktop\\Java Selenium Course\\selenium\\Ss\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
			
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("greens@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[2]"));
		password.sendKeys("23456789");
		
		WebElement facebook = driver.findElement(By.className("_8eso"));
		String text = facebook.getText();
	    System.out.println(text);
		
		WebElement facebook1 = driver.findElement(By.tagName("h2"));
		String tagName = facebook1.getTagName();
		System.out.println(tagName);
		
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		link.click();
		
		
		
		
		
		
		
}
}