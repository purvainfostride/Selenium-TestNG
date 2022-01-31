package com.bindcode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
class Pathmethods{
	WebDriver driver= new ChromeDriver();
	public void axesXpath() {
		//REDIFF
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
	
		//Self Method
		WebElement self= driver.findElement(By.xpath("//a[contains(text(),'Triveni Turbine')]/self::a"));
		System.out.println("Text by Self Method: "+self.getText());
		//Parent Method
		WebElement parent= driver.findElement(By.xpath("//a[contains(text(),'Triveni Turbine')]/parent::td"));
		System.out.println("Text by Parent Method: "+parent.getText());
		//Child Method
		   List<WebElement>  child= driver.findElements(By.xpath("//a[contains(text(),'Triveni Turbine')]/ancestor::tr/child::td"));
		   for(int i=0; i<child.size();i++) {
		        System.out.println(child.get(i).getText());
		   }
		
	}
}
public class LocatebyXpath extends Pathmethods{
	public static void main(String args[])  {
		WebDriverManager.chromiumdriver().setup();
		LocatebyXpath l= new LocatebyXpath();
		l.axesXpath();
	}
}
