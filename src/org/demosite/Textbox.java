package org.demosite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {
	private static String Keys;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avila Theresa\\Desktop\\Java Selenium Course\\selenium\\Ss\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Index.html");
		WebElement textbox = driver.findElement(By.id("email"));
		textbox.sendKeys("minz.jema@gmail.com");
		WebElement image = driver.findElement(By.id("enterimg"));
		image.click();

		WebElement first = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		first.sendKeys("M.Mincy");
		
		WebElement last = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		last.sendKeys("Moni");
		
		WebElement tag = driver.findElement(By.xpath("//textarea[@rows='3']"));
		tag.sendKeys("Theni");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("minz.jema@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("9677463137");
		
		WebElement gender = driver.findElement(By.xpath("//input[@value='FeMale']"));
		gender.click();
		
		
		WebElement hobbies = driver.findElement(By.id("checkbox3"));
		hobbies.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}