package selinium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepraj\\eclipse-workspace\\drivers\\drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.amazon.in/");
       driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//*[@class='nav-a  '])[2]")).click();
       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(0,200)");
       driver.findElement(By.xpath("(//*[@class='a-unordered-list a-nostyle a-vertical a-spacing-medium'])[5]")).click();
      // driver.close();
       
       
	}
}
