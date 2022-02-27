package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepraj\\eclipse-workspace\\drivers\\drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com");
       driver.manage().window().maximize();
       driver.findElement(By.id("email")).sendKeys("9442376486");
       Thread.sleep(3000);
       driver.findElement(By.id("pass")).sendKeys("deepraj123");
       driver.findElement(By.id("submit")).click();
       driver.close();

	}

}
