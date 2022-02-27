package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDatesamemonth {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "https://cleartrip.com/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepraj\\eclipse-workspace\\drivers\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
		String depDate = "31-5-2021";
		String arrDepDate[] = depDate.split("-");
		String dDay = arrDepDate[0];
		String dMonth = arrDepDate[1];
		String dYear = arrDepDate[2];
		
//		System.out.println("Day --"+dDay);
//		System.out.println("Month --"+dMonth);
//		System.out.println("Year --"+dYear);
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement dtDept = driver.findElement(By.xpath("//input[@id='DepartDate']"));
		dtDept.click();
    //	WebElement depCalendar = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/table"));
		List<WebElement> AllDays = driver.findElements(By.xpath("//div[@class='monthBlock first']//table//tbody//td"));
		int Totaldays = AllDays.size();
	//	System.out.println("TotalDays");
		for (int i=0; i<Totaldays; i++)
		{
			String dayNum = AllDays.get(i).getText();
			System.out.println(dayNum);
			if (dDay.equals(dayNum))
			{
				AllDays.get(i).click();
				System.out.println(dayNum);
	//			Thread.sleep(2000);
				break;
			}
	//		Thread.sleep(3000);
		}
		Thread.sleep(3000);
		String selectedDate = dtDept.getAttribute("Value");
		System.out.println("Selected date is : "+ selectedDate);
			}
		

	}


