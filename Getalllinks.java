package selinium;


import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getalllinks {

	private static WebElement pagelink;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url = "http://Yahoo.com";
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get(url);
		Thread.sleep(5000);
		String pgTitle = driver.getTitle();
		By drive;
		//List links = (List) drive.findElements((By.cssSelector("a"));
		List<WebElement> links = (List<WebElement>) driver.findElement(By.tagName("a"));
		int linkscount = links.size();
		System.out.println("Total Links in...."+ pgTitle+ " is..>" + linkscount);
		int i = 1;
		for (WebElement pglink : links)
		{
			String linktext = pagelink.getText();
			String link = pagelink.getAttribute("href");
			System.out.println("i+ linktext + --- + link");
			i = i+1;
			  //     System.out.println(linktext+" ->");
		      //    System.out.println(link);
		
		}
			
				
		

	}

}
