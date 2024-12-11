package page;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class registration {
	
	private static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://yogsathi.com/BookingCenter");
		
		for(int i=0; i<20; i++) {
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Karan");
			driver.findElement(By.xpath("//input[@name='WhatsAppNumber']")).sendKeys("9896989685");
			
			WebElement state = driver.findElement(By.id("target_state_dropdown2"));
			Select drpState = new Select(state);
			drpState.selectByIndex(7);
			
			Thread.sleep(1000);
			WebElement city = driver.findElement(By.id("city_dropdown2"));
			Select drpCity = new Select(city);
			drpCity.selectByVisibleText("Akaltara");
			
			driver.findElement(By.xpath("//input[@name='pincode' and @type='number']")).sendKeys("123456");
			
			driver.findElement(By.xpath("//button[contains(@class,'pbmit-btn') and @type='submit']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(@class, 'swal2-confirm swal2-styled') and text()='OK']")).click();
		}
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
