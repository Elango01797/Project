package selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepraj\\eclipse-workspace\\drivers\\drivers\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://gmail.com");
	       driver.manage().window().maximize();
	       driver.findElement(By.id("identifierId")).sendKeys("deeprajmech38@gmail.com");
	       Thread.sleep(2000);
	       driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	       Thread.sleep(2000);	    
	}

}
