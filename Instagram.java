package com.VinuMichael.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinum\\eclipse-workspace\\com.VinuMichael.assignments\\Drivers\\ChromeDriver 100\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("_9GP1n   ")).sendKeys("vinustarts@gmail.com");
		
		
			
		
		
		
		
		
		
	}
	

}
