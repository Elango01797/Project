package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
public class orangehrm1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepraj\\eclipse-workspace\\drivers\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/";
		String uname = "Admin";
		String pword = "admin123";
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
// Open (Launch) the Orange HRM Application
		driver.get(url);
		Thread.sleep(4000);
// Login into Application
// Create Object for each Element in Login Page
		WebElement txtUname =driver.findElement(By.id("txtUsername"));
		WebElement txtPword = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
// Perform the operations on Login Page
		txtUname.sendKeys(uname);
		txtPword.sendKeys(pword);
		btnLogin.click();
		Thread.sleep(5000);
		//search for user
		driver.findElement(By.linkText("Admin")).click();
		WebElement SearchUser=driver.findElement(By.id("searchSystemUser_userName"));
		Select UserType=new Select(driver.findElement(By.id("searchSystemUser_userType")));
		WebElement SearchEmp=driver.findElement(By.id("searchSystemUser_employeeName_empName"));
		Select UserStatus=new Select(driver.findElement(By.id("searchSystemUser_status")));
		WebElement btnSearch=driver.findElement(By.id("searchBtn"));
		//SearchUser.SendKeys("Lisa");
		UserType.selectByIndex(2);
		SearchEmp.sendKeys("Lisa");
		UserStatus.selectByVisibleText("Enabled");
		btnSearch.click();
		
	//Logout
	
		
		WebElement linkUser = driver.findElement(By.partialLinkText("Welcome"));
		linkUser.click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Welcome")).click();
		//close browser
		
		Thread.sleep(3000);
        driver.close();
		}
		
	
	}


