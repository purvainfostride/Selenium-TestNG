package com.bindcode;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;

public class Assignment {
	WebDriver driver= new ChromeDriver();
	String fName = RandomStringUtils.randomAlphabetic(10);
	String mno = RandomStringUtils.randomNumeric(10);
	String userPass = RandomStringUtils.randomAlphanumeric(10);
	String FacebookURL= "https://www.facebook.com/";
	
	public void assignment() throws InterruptedException {
		driver.get("https://www.google.co.in/");
		driver.navigate().to(FacebookURL);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		//Q1- Finding signup button in Facebook website by Child method
		driver.findElement(By.xpath("//div[@class='_1lch']//button[@type='submit']")).click();
		Thread.sleep(2000);
		//Q2- Locating Firstname field from Signup button using Parent method
		driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']/parent::div[@class='_1lch']"
		+ "/preceding-sibling::div[@id='fullname_field']//child::input[@name='firstname']")).sendKeys(fName);
		//Q4- Locating mobile number from new password by using Preceding method
		driver.findElement(By.xpath("//input[@name='reg_passwd__']//preceding::input[@name='reg_email__']"))
		.sendKeys(mno);
		//Q3- Identifying the password field from mobile number field by using following method
		driver.findElement(By.xpath("//input[@name='reg_email__']//following::input[@name='reg_passwd__']"))
		.sendKeys(userPass);
		Thread.sleep(2000);
		driver.close();
		//Q5 Fetch All the news from BBC website
		driver = new ChromeDriver();// driver has been re-opened
		driver.navigate().to("https://www.bbc.com/news");
		driver.manage().window().maximize();
		//driver.get("https://www.bbc.com/news");
		List<WebElement> allnews = driver.findElements(By.tagName("a"));
		System.out.println(allnews.size());
		for(int i = 0;i<allnews.size();i++){
		String news = allnews.get(i).getText();
		System.out.println(news);
		Thread.sleep(2000);
		driver.close();
		}				
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		Assignment A= new Assignment();
		A. assignment();

	}

}
