package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Getlistitems {

	private static final String drpSkills = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url ="http://demo.automationtesting.in";
		String uname = "Admin";
		String pword = "admin123";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepraj\\eclipse-workspace\\drivers\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		WebElement imgNextButton = driver.findElement(By.xpath("//img[@src='enter.png']"));
		imgNextButton.click();
		Thread.sleep(2000);
		Select drpskills =new Select (driver.findElement(By.xpath("//select[@id='Skills']")));
		Select CountryList = new Select(driver.findElement(By.xpath("//select[@id='countries']")));
		WebElement txtFirstName = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		txtFirstName.sendKeys("Deepraj");
		Thread.sleep(2000);
		String n1 = txtFirstName.getAttribute("value");
		System.out.println(n1);
		List<WebElement> AllSkills = drpskills.getOptions();
		List <WebElement> AllCountries = CountryList.getOptions();
		int cc = AllCountries.size();
		int lc = AllSkills.size();
		System.out.println("Number of items in Skills drop down...");
		System.out.println("Number of countries listed..."+cc);
		for (WebElement cnt : AllCountries) {
			System.out.println(cnt.getText());
		}
		for (WebElement skill : AllSkills) {
			System.out.println(skill.getText());
			
		}
		

	}

}
