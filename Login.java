package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.*;

public class Login extends TestNGDemo{
	
@Test
public void login() {

	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
    driver.findElement(By.name("Submit")).click();
}
@Test
public void forgetpass(){
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.navigate().back();
}
}
