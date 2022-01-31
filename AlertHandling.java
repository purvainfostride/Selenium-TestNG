package ddFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
	
	WebDriver driver= new ChromeDriver();
	String url="https://mail.rediff.com/cgi-bin/login.cgi";

	public void alertHandling() throws InterruptedException {
		//Getting URL of Rediffmail
		driver.get(url);
		//Clicking on Signup button without entering credentials
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		// Switching to alert with Alert class
		Alert alt=driver.switchTo().alert();
		//printing Alert msg
		System.out.println("Text of Alert is "+ alt.getText());
		//Accepting alert with accept method in alert class
		alt.accept();
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		AlertHandling A=new AlertHandling();
		A.alertHandling();

	}
}
