package com.VinuMichael.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinum\\eclipse-workspace\\com.VinuMichael.assignments\\Drivers\\ChromeDriver 100\\chromedriver.exe"
				+ "");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(4000);
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phone");
	//driver.findElement(By.id("nav-search-submit-button")).click();
	//driver.navigate().to("https://www.facebook.com/");
	//Thread.sleep(4000);
	//driver.navigate().back();
	//driver.quit();
	
	System.out.println(driver.findElement(By.cssSelector("div.nav-left")).getText());
	
	
	
	
	
	
	
	
	}

}
