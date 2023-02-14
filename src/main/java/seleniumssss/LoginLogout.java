package seleniumssss;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
public class LoginLogout {
	@Test
public void openbrowser() {
	System.getProperty("webdriver.chrome.driver", 
			"D://02-Projects//CoreJava//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
}
}
