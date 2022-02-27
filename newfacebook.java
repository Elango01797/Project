package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newfacebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepraj\\eclipse-workspace\\drivers\\drivers\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       Thread.sleep(3000);
	       driver.get("https://facebook.com/");
	       driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   int s2 = 2000;
	    	Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
	       Thread.sleep(2000);
	    //   WebDriver txtFsname = driver.findElement(By.xpath("//input[@id='u_2_a_k/']"));
	      // WebDriver txtLname = driver.findElement(By.xpath("//input[@name='lastname']"));
	       //WebDriver txtMobnum = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	       //WebDriver txtPword = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	       //WebDriver SlcBday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	       //WebDriver SlcBmnth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	       //WebDriver SlcByear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		   Thread.sleep(s2);
		   //txtFsname.sendKeys("Deepraj");
		   //txtLname.sendKeys("P");
		   
	      

	}	

}
