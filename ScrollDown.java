package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepraj\\eclipse-workspace\\drivers\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
//Launch Site
		driver.get("http://spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-200)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-200)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-200)");
		driver.findElement(By.xpath("//a[@href='https://myspicejet.secure.force.com/Passenger']")).click();

	}

}
