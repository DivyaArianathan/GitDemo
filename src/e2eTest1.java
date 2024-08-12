import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2eTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(1000);
		//To select current date from calendar
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
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
	    
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000L);
		int i=1;
		while(i<3)
		{
		    driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
		WebElement CurrencyDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(CurrencyDropdown);
		dropdown.selectByIndex(3);
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		//Handling Alert
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}

}
