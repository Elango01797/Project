package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {
 WebDriver driver = new ChromeDriver();
		// System.setproperty("webdriver.chrome.driver","C:\\Users\\Deepraj\\eclipse-workspace\\drivers\\drivers\\chromedriver.exe");
 public void launchApp(String url) 
 {
	 driver.get(url);
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
 }
 public void login(String uname, String pword)
 {
	  WebElement txtUname =driver.findElement(By.id("txtUsername"));
	  WebElement txtpword =driver.findElement(By.id("txtPassword"));
	  WebElement btnlogin =driver.findElement(By.id("btnLogin"));
	 //perform the operation on login page
	    txtUname.sendKeys(uname);
		txtpword.sendKeys(pword);
		btnlogin.click();
	
	 
	 }
 }
	 
