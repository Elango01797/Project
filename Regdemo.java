package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Regdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepraj\\eclipse-workspace\\drivers\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		String url = "http://demo.automationtesting.in";
		int s2 = 2000;
		driver.get(url);
		Thread.sleep(5000);
// Create the Elements
		WebElement imgNextButton = driver.findElement(By.xpath("//img[@src='enter.png']"));
		imgNextButton.click();
		Thread.sleep(5000);

		WebElement txtFname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		WebElement txtLname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		WebElement txtEmail = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		WebElement txtPhone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		WebElement txtPword = driver.findElement(By.xpath("//input[@ng-model='Password']"));
		WebElement txtConfPword = driver.findElement(By.xpath("//input[@ng-model='CPassword']"));
		WebElement rdbMale = driver.findElement(By.xpath("//input[@value='Male']"));
		WebElement rdbFemale = driver.findElement(By.xpath("//input[@value='FeMale']"));
		WebElement chkCricket = driver.findElement(By.xpath("//input[@value='Cricket']"));
		WebElement chkMovies = driver.findElement(By.xpath("//input[@value='Movies']"));
		WebElement chkHockey = driver.findElement(By.xpath("//input[@value='Hockey']"));
		
		WebElement labelLanguages = driver.findElement(By.xpath("//div[@id='msdd']"));
		Select drpSkills = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		Select drpCountry1 = new Select(driver.findElement(By.xpath("//select[@id='countries']")));
		
		
		Select drpBYear = new Select(driver.findElement(By.xpath("//select[@placeholder='Year']")));
		Select drpBMonth = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		Select drpBDay = new Select(driver.findElement(By.xpath("//select[@placeholder='Day']")));
		WebElement btnSubmit = driver.findElement(By.xpath("//button[@id='submitbtn']"));

// Enter the Input Values
		txtFname.sendKeys("Surya");
		Thread.sleep(s2);
		txtLname.sendKeys("Prakash");
		Thread.sleep(s2);
		txtAddress.sendKeys("Hyderabad");
		Thread.sleep(s2);
		txtEmail.sendKeys("suryaprakash@gmail.com");
		Thread.sleep(s2);
		txtPhone.sendKeys("1234567890");
		Thread.sleep(s2);
		labelLanguages.click();
		Thread.sleep(s2);
		driver.findElement(By.xpath("//a[text()='English']")).click();
		Thread.sleep(s2);
		driver.findElement(By.xpath("//a[text()='Arabic']")).click();
		Thread.sleep(s2);
		rdbMale.click();
		Thread.sleep(s2);
		chkCricket.click();
		Thread.sleep(s2);
		chkMovies.click();
		Thread.sleep(s2);
		chkHockey.click();
		Thread.sleep(s2);
		drpSkills.selectByVisibleText("Python");
		Thread.sleep(s2);
		drpCountry1.selectByVisibleText("India");
		Thread.sleep(s2);
		drpCountry1.selectByVisibleText("India");
		Thread.sleep(s2);
		drpBYear.selectByVisibleText("2000");
		Thread.sleep(s2);
		drpBMonth.selectByVisibleText("April");
		Thread.sleep(s2);
		drpBDay.selectByVisibleText("12");
		Thread.sleep(s2);
		txtPword.sendKeys("Hello@123");
		Thread.sleep(s2);
		txtConfPword.sendKeys("Hello@123");
		Thread.sleep(s2);		
		WebElement drpCountry2 = driver.findElement(By.xpath("//span[@role='combobox']"));
		drpCountry2.click();
		Thread.sleep(s2);
		WebElement Country2 = driver.findElement(By.xpath("//li[text()='India']"));
		Country2.click();
		Thread.sleep(s2);
		btnSubmit.click();
		Thread.sleep(5000);		
		


	}

}
