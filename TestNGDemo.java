package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestNGDemo {
	public static WebDriver driver;
	public static String path;
	
@BeforeSuite
public void lauchbrowser() {
	path=System.getProperty("user.dir")+ "//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
}
@AfterSuite
public void closebrowser() {
	driver.close();
}

}
