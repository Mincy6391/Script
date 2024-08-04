package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserLaunch {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avila Theresa\\Desktop\\Java Selenium Course\\selenium\\Ss\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			WebElement account = driver.findElement(By.xpath("//a[text()='Create new account']"));
			account.click();
			
			Thread.sleep(2000);
			WebElement name = driver.findElement(By.name("firstname"));
			name.sendKeys("Mincy");	
			
			Thread.sleep(2000);
			WebElement last = driver.findElement(By.name("lastname"));
			last.sendKeys("M");
			
			WebElement date = driver.findElement(By.id("day"));
			Select s=new Select(date);
			s.selectByIndex(8);
			
			WebElement month = driver.findElement(By.id("month"));
			Select s1=new Select(month);
			s1.selectByValue("3");
			
			boolean multiple = s1.isMultiple();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

}
}
