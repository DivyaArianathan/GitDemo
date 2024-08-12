import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoopingDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000L);
		//int i=1;
		//while(i<3)
		//{
		//	driver.findElement(By.id("hrefIncAdt")).click();
		//	i++;
		//}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<3;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
			
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	}

}
