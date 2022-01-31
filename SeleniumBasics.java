package com.bindcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import java.util.List;

class Methods {
	
	WebDriver driver= new ChromeDriver();
	String loginuser = "Admin";
	String loginpass = "admin123";
	//Maximizing the window
	void login() {
		driver.manage().window().maximize();
		//getting the URL of the website
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.name("txtUsername")).sendKeys(loginuser);
        driver.findElement(By.name("txtPassword")).sendKeys(loginpass);
        //LinkText locator & getText method
        WebElement linktxt=driver.findElement(By.linkText("Forgot your password?"));
        System.out.println("Getting "+ linktxt.getText()+ "text from the linktext locator");
        //Getting the size of All anchor tags present in login page
        List<WebElement> aTagInLogin = driver.findElements(By.tagName("a"));
        System.out.println("Total anchor tags present in login page: "+aTagInLogin.size());
        //Logging in
        driver.findElement(By.name("Submit")).click();
        //verifying Login URL
        String expectedLoginUrl ="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
        String actualLoginUrl= driver.getCurrentUrl();
        if(expectedLoginUrl.equals(actualLoginUrl)) {
        	System.out.println("Login URL MATCHED");
        }
        else {
        	System.out.println("Login URL NOT MATCHED");
        }      
	}
	void dashboard() {
		//Getting the size of All anchor tags present in Home page
        List<WebElement> aTagInDB = driver.findElements(By.tagName("a"));
        System.out.println("Total anchor tags present in login page: "+aTagInDB.size());
        for(int i=0; i<aTagInDB.size();i++) {
        System.out.println(aTagInDB.get(i).getText());
        }
	}
	void locatebyXpath()  {//ORANGEHRM MAINTAINANCE 
		//Locator By X path and contains method
		driver.findElement(By.xpath("//a[contains(@id,'menu_maintenance_purgeEmployee')]")).click();
		//Locator By X path and contains & text method
		WebElement txt=driver.findElement(By.xpath("//div[contains(text(),'access to their data')]"));
		//Locator  By X path & and method
		driver.findElement(By.xpath("//input[@id='confirm_password' and @name='confirm_password']")).sendKeys(loginpass);
		System.out.println("Text present below verify is: "+txt.getText());
		//Locator By X path with attribute
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
 }
public class SeleniumBasics extends Methods{
	public static void main(String args[])  {
		//WebDriverManagerSetup
		WebDriverManager.chromiumdriver().setup();
		SeleniumBasics S= new SeleniumBasics();
		S.login();
		S.locatebyXpath();
		//S.dashboard();
	
	}
}


