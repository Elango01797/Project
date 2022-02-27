package selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDropDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepraj\\eclipse-workspace\\drivers\\drivers\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	       driver.get("http://demo.automationtesting.in");
	       Thread.sleep(2000);
	       WebElement imgNextButton = driver.findElement(By.xpath("//img[@id='enterimg']"));
	       imgNextButton.click();
	       WebElement Interactions = driver.findElement(By.xpath("//a[@href='Interactions.html']"));
	       Interactions.click();
	       WebElement Button = driver.findElement(By.xpath("//*[text()='Drag and Drop ']"));
	       Button.click();
	       WebElement Select = driver.findElement(By.xpath("//a[@href='Static.html']"));
           Select.click();
           
	}

}
