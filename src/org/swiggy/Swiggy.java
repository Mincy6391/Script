package org.swiggy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avila Theresa\\Desktop\\Java Selenium Course\\selenium\\Ss\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.xpath("//span[text()='Other']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("chennai");
		
			

}
}
