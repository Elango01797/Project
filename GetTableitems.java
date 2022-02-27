package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTableitems {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepraj\\eclipse-workspace\\drivers\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/";
		String uname = "Admin";
		String pword = "admin123";
// Open (Launch) the Orange HRM Appplication
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		// Login into Application
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pword);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
//Navigate to PIM Module
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/index.php/pim/viewEmployeeList/reset/1']")).click();
		Thread.sleep(2000);
	//	WebElement tbl2Col = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[2]/td[2]"));
	//  WebElement tbl2Col1 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]'"));
		WebElement fname = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[2]/td[3]"));
		WebElement lname = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[2]/td[4]"));
		WebElement empTable = driver.findElement(By.xpath("//table[@id='resultTable']/tbody"));
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowCount = rows.size();
		System.out.println("Total Rows = "+rowCount);
		String xpathStartig = "//table[@id='resultTable']/tbody/tr[";
		String xpathEnding3 = "]/td[3]";
		String xpathEnding5 = "]/td[5]";
		String xp3, xp5;
		String firstname, job;
		for (int i=1; i<rowCount; i++)
		{
			xp3 = xpathStartig + i + xpathEnding3;
			xp5 = xpathStartig + i + xpathEnding5;
			//System.out.println(xp);
			firstname = driver.findElement(By.xpath(xp3)).getText();
			job = driver.findElement(By.xpath(xp5)).getText();
			System.out.println(i + ". "+ firstname + " .... Working as .."+job);
			
		}
		driver.close();
/*		String firstname1 = fname.getText();
		String lastname = lname.getText();
		String fullname = firstname1 + " " + lastname;
		System.out.println(fullname); */
	}

}
