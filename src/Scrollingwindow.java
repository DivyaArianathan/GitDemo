import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrollingwindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		List<WebElement> Amount = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		for(int i=0; i<Amount.size(); i++)
		{
			//System.out.println(Integer.parseInt(Amount.get(i).getText()));
			sum = sum + Integer.parseInt(Amount.get(i).getText());
		}
		System.out.println(sum);
		int actual = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, actual);

	}

}
