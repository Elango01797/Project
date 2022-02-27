package selinium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepraj\\eclipse-workspace\\drivers\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(5000);
		WebElement menuSwitchTo = driver.findElement(By.xpath("//a[@href='SwitchTo.html']"));
		action.moveToElement(menuSwitchTo).perform();
		Thread.sleep(2000);
		WebElement subMemuAlerts = driver.findElement(By.xpath("//a[@href='Alerts.html']"));
		action.moveToElement(subMemuAlerts).click().perform();
		Thread.sleep(2000);
		WebElement Alert_Ok = driver.findElement(By.xpath("//a[@href='#OKTab']"));
		WebElement Alert_OkCancel = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		WebElement Alert_Text = driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]"));
//OK Cancel		
		action.moveToElement(Alert_Text).click().perform();
		Thread.sleep(2000);
		WebElement btnAlert2 = driver.findElement(By.xpath("//button[contains(text(), 'confirm')]"));
		btnAlert2.click();
		
		
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.accept();
//		alert2.dismiss();
		Thread.sleep(2000);
		
//Promt TextBox
		action.moveToElement(Alert_Text).click().perform();
		Thread.sleep(2000);
		WebElement btnAlert3 = driver.findElement(By.xpath("//button[contains(text(), 'prompt')]"));
		btnAlert3.click();
		Thread.sleep(2000);
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Deepraj");
		Thread.sleep(2000);
		alert3.accept();
		Thread.sleep(2000);
		WebElement txt = driver.findElement(By.xpath("//p[@id='demo']"));
		String disText = txt.getText();
		System.out.println(disText);
		
//OB Button
		action.moveToElement(Alert_Ok).click().perform();
		Thread.sleep(2000);
		WebElement btnAlert1 = driver.findElement(By.xpath("//button[contains(text(), 'alert')]"));
		btnAlert1.click();
		Thread.sleep(2000);
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.accept();
		
		
	}

}
