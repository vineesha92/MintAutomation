package com.saample.mintautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest
{

	WebDriver driver;

	
	@BeforeTest
	public void UrlLaunch(){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\vkasireddy\\Documents\\MintAutomation\\mintautomation\\src\\test\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.mint.com");
	}
	
	@Test
	public void loginTest(){
		
		driver.findElement(By.xpath("/html/body/header/div/nav[2]/a[1]")).click();

		WebElement userid = driver.findElement(By.id("ius-userid"));
		userid.clear();
		userid.sendKeys("vineesha.kasireddy@gmail.com");

		WebElement password = driver.findElement(By.id("ius-password"));
		password.clear();
		password.sendKeys("Vineesha@01");
		
		driver.findElement(By.id("ius-sign-in-submit-btn")).click();
		//driver.quit();
		
	}
	
}
