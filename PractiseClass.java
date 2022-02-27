package selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepraj\\eclipse-workspace\\drivers\\drivers\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       String url = "http://demo.automationtesting.in";
	       int s2 = 2000;
	       driver.get(url);
	       Thread.sleep(2000);
	       
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement imgbtn = driver.findElement(By.xpath("//img[@src='enter.png']"));
		imgbtn.click();
		Thread.sleep(2000);
		WebElement txtFname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		WebElement txtLname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		WebElement txtAdress = driver.findElement(By.xpath("//*[@ng-model='Adress']"));
		WebElement txtEmail = driver.findElement(By.xpath("//*[@ng-model='EmailAdress']"));
		WebElement txtMob = driver.findElement(By.xpath("//*[@ng-model='Phone']"));
		WebElement txtPword = driver.findElement(By.xpath("//*[@ng-model='Password']"));
		WebElement txtCnfmpword = driver.findElement(By.xpath("//*[@ng-model='CPassword']"));
		
		WebElement radFemale = driver.findElement(By.xpath("//*[@value='FeMale']"));
		
		WebElement chkCricket = driver.findElement(By.xpath("//*[@id='checkbox1']"));
		
		WebElement sellang = driver.findElement(By.xpath("//*[@id='msdd']"));
		
		WebElement drpskill = driver.findElement(By.xpath("//*[@id='Skills']"));
		WebElement drpCountry = driver.findElement(By.xpath("//*[@ng-model='country']"));
		WebElement drpSelCountry = driver.findElement(By.xpath("//*[@id='country']"));
		WebElement drpByear = driver.findElement(By.xpath("//*[@ng-model='yearbox']"));
		WebElement drpBmonth = driver.findElement(By.xpath("//*[@ng-model='monthbox']"));
		WebElement drpBday = driver.findElement(By.xpath("//*[@ng-model='daybox']"));
		
		WebElement imgSubmit = driver.findElement(By.xpath("//*[@id='submitbtn']"));
		
		
		txtFname.sendKeys("Yuhana");
		Thread.sleep(s2);
		txtLname.sendKeys("Subburaj");
		Thread.sleep(s2);
		txtAdress.sendKeys("Udumalaipattai,Kerala");
		Thread.sleep(s2);
		txtEmail.sendKeys("yuhanasubburaj@gmail.com");
		Thread.sleep(s2);
		txtMob.sendKeys("9442376486");
		Thread.sleep(s2);
		radFemale.click();
		Thread.sleep(s2);
		chkCricket.click();
		Thread.sleep(s2);
		sellang.click();
		Thread.sleep(s2);
		driver.findElement(By.xpath("//a[text()='Hindi']")).click();
		Thread.sleep(s2);
	//	drpskill).SelectByVisibletext("c");
		Thread.sleep(s2);
		
		
	       

	}

}
