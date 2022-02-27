package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_tables {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepraj\\eclipse-workspace\\drivers\\drivers\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("http://www.leafground.com/pages/table.html");
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       Thread.sleep(2000);
	       List<WebElement> allele = driver.findElements(By.xpath("//table[@class='display']/tbody/tr/td"));
	       for (WebElement table : allele) {
	    	   System.out.println(table.getText());
	    	 System.out.println("********ROW DATA ***********"); 
	       }
	    	 List<WebElement> row = driver.findElements(By.xpath("//table[@class='display']/tbody/tr[3]/td")); 
			for (WebElement par : row) {
				System.out.println(par.getText());
			}
			 List<WebElement> col = driver.findElements(By.xpath("//table[@class='display']/tbody/tr/td[4]")); 
				for (WebElement par1 : col) {
					System.out.println(par1.getText());
					System.out.println("*********COLUMN DATA*********");
				}
				List<WebElement> tag = driver.findElements(By.tagName("tr"));
				for (WebElement name : tag) {
					System.out.println(name.getText());
					
				}
	}

}
