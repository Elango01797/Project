package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithWebtable {

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
		WebElement tbl2Col = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[2]/td[2]"));
//		WebElement tbl2Col = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]'"));
		WebElement eid = driver.findElement(By.xpath("//table/tbody/tr[13]/td[2]"));
		WebElement fname = driver.findElement(By.xpath("//table/tbody/tr[13]/td[3]"));
		WebElement lname = driver.findElement(By.xpath("//table/tbody/tr[13]/td[4]"));
		String empid = eid.getText();
		String firstname = fname.getText();
		String lastname = lname.getText();
		
		System.out.println("Emp Id ..." + empid);
		
		System.out.println("Emp First Name :"+firstname);
		System.out.println("Emp Last Name : "+ lastname);
		
		


	}

}
