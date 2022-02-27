package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url = "https://facebook.com/";
		String uname = "Admin";
		String pword = "admin123";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepraj\\eclipse-workspace\\drivers\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9442376486");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("facebook123");
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
