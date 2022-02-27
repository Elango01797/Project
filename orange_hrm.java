package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class orange_hrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepraj\\eclipse-workspace\\drivers\\drivers\\chromedriver.exe");
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

// 3. Navigate to Users Menu			
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		Thread.sleep(3000);

// 4. Create a New User
		String strEmpName = "Lisa Andrews";
		String strUname = "TestLisa	";
		String setPword = "Hello@123";
		String confPword = "Hello@123";
		driver.findElement(By.id("btnAdd")).click();
		WebElement empName = driver.findElement(By.id("systemUser_employeeName_empName"));
		WebElement userName = driver.findElement(By.id("systemUser_userName"));
		WebElement passWord = driver.findElement(By.id("systemUser_password"));
		WebElement confPassWord = driver.findElement(By.id("systemUser_confirmPassword"));
		WebElement btnSave = driver.findElement(By.id("btnSave"));
			empName.sendKeys(strEmpName);
			userName.sendKeys(strUname);
			passWord.sendKeys(setPword);
			confPassWord.sendKeys(confPword);
			btnSave.click();
			//select user 
			
       // Find Number of CheckBoxes and Select All
			driver.findElement(By.linkText("Admin")).click();
			Thread.sleep(2000);
			List<WebElement> chkBoxes = driver.findElements(By.name("chkSelectRow[]"));
			int totalUsers = chkBoxes.size();
			System.out.println("Total Users are..."+totalUsers);
			for(int i=0; i<chkBoxes.size(); i=i+2)
				{
				chkBoxes.get(i).click();
				}
			//select user
			driver.findElement(By.linkText("Admin")).click();
			driver.findElement(By.id("ohrmList_chkSelectRecord_44")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("ohrmList_chkSelectRecord_44")).click();
			//delete user
			driver.findElement(By.linkText("Admin")).click();
			WebElement usercheckbox=driver.findElement(By.id("ohrmList_chkSelectRecord_31"));
			usercheckbox.click();
			Thread.sleep(3000);
			driver.findElement(By.id("btnDelete")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("dialogDeleteBtn")).click();
			
			//Logout
			WebElement linkUser = driver.findElement(By.partialLinkText("Welcome"));
			linkUser.click();
			Thread.sleep(3000);
			driver.findElement(By.partialLinkText("Welcome")).click();
			driver.findElement(By.linkText("Logout")).click();
			
       driver.close();

	}

}
