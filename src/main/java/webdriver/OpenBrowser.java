package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenBrowser {
public static void main (String args[]) throws Exception {
	System.getProperty("webdriver.chrome.driver", 
			"E:\\02-Projects\\CoreJava\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.get("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("suresh");
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("suresh123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='Submit']")).click();
	System.out.println("Login success");
	Thread.sleep(3000);
	
	driver.switchTo().frame("rightMenu");
	System.out.println("Enterd into frame ");
	driver.findElement(By.linkText("rintu  Sahoo")).click();
	//driver.findElement(By.linkText("Logout")).click();	
	Thread.sleep(4000);
	//driver.close();

}
}
