package com.VinuMichael.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\vinum\\eclipse-workspace\\com.VinuMichael.assignments\\Drivers\\ChromeDriver 100\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	//driver.findElement(By.id("email")).sendKeys("vinustarts@gmail.com");
	//driver.findElement(By.id("pass")).sendKeys("rambo@1234");
	//driver.findElement(By.name("login")).click();
	System.out.println(driver.findElementByCssSelector("div._6ltj").getText());
	
	
	
	
	
	
	
	
	
	
	
	
}
}
