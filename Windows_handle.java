package selinium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_handle {

	public static void main(String[] args) throws AWTException, InterruptedException {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepraj\\eclipse-workspace\\drivers\\drivers\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.amazon.in/");
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       Thread.sleep(2000);
	       WebElement bestseller = driver.findElement(By.xpath("(//*[@class='nav-a  '])[1]"));
	       Actions ac=new Actions(driver);
	       ac.contextClick(bestseller).build().perform();
	       Robot r = new Robot();
	       r.keyPress(KeyEvent.VK_DOWN);
	       r.keyRelease(KeyEvent.VK_DOWN);
	       Thread.sleep(2000);
	       r.keyPress(KeyEvent.VK_ENTER);
	       r.keyRelease(KeyEvent.VK_ENTER);
	       WebElement best = driver.findElement(By.xpath("(//*[@class='nav-a  '])[2]"));
	       ac.contextClick(best).build().perform();
	       r.keyPress(KeyEvent.VK_DOWN);
	       r.keyRelease(KeyEvent.VK_DOWN);
	       Thread.sleep(2000);
	       r.keyPress(KeyEvent.VK_ENTER);
	       r.keyRelease(KeyEvent.VK_ENTER);
	       WebElement mobiles = driver.findElement(By.xpath("(//*[@class='nav-a  '])[3]"));
	       ac.contextClick(best).build().perform();
	       r.keyPress(KeyEvent.VK_DOWN);
	       r.keyRelease(KeyEvent.VK_DOWN);
	       Thread.sleep(2000);
	       r.keyPress(KeyEvent.VK_ENTER);
	       r.keyRelease(KeyEvent.VK_ENTER);
	       Set<String> handles = driver.getWindowHandles();
	       for(String st:handles) {
	    	   System.out.println(st);
	    	   String title = driver.switchTo().window(st).getTitle();
	    	   System.out.println(title);
	       }
	       String actual ="Mobile Phones";
	         for(String st1:handles) {
	        	 if(driver.switchTo().window(st1).getTitle().equals(actual));
	        	 break;
	         }
	       
	       
	       
	       
	       
	       
	       
	       
	}

}
