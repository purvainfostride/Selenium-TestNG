package TestNG;

import static org.testng.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.*;

public class HomePage extends TestNGDemo {
static String actualTitle;
@Test
public void verifypage() {
	actualTitle = driver.getTitle();
	assertEquals(actualTitle, "OrangeHRM");
}
@Test
public void logout() {
	driver.findElement(By.partialLinkText("Welcome")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	driver.findElement(By.linkText("Logout")).click();
}
}
