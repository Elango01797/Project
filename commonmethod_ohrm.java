package selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class commonmethod_ohrm {
	static WebDriver driver = new ChromeDriver();
	public static void login() throws InterruptedException
	{
	
	String url = "https://opensource-demo.orangehrmlive.com";
	String uname = "Admin";
	String pword = "admin123";
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
//Open (Launch) the Orange HRM Application
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepraj\\eclipse-workspace\\drivers\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    Common cm =new Common();
    cm.launchApp(url);
	Thread.sleep(5000);
	cm.login(uname, pword);
	Thread.sleep(2000);

}
}

