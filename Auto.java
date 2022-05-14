package com.VinuMichael.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinum\\eclipse-workspace\\com.VinuMichael.assignments\\Drivers\\ChromeDriver 100\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElementByXPath("//input[@type='text']").sendKeys("vinustarts@gmail.com");
		driver.findElementByXPath("//input[@type='password']").sendKeys("rambo@1234");
		driver.findElementByXPath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']").click();
		
	}

}
