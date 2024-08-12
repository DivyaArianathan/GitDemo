import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ElementEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
	    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Is enabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Is Disabled");
			Assert.assertFalse(false);
		}
	}

}
