import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://toolsqa.com/");
		//Print count of links from entire page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Print count of links only on Footer - Limit the scope of driver
		WebElement footerDriver = driver.findElement(By.className("links-wrapper"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		WebElement footerColumn1 = footerDriver.findElement(By.className("col-sm-6"));
		System.out.println(footerColumn1.findElements(By.tagName("a")).size());
		for(int i=0; i<footerColumn1.findElements(By.tagName("a")).size(); i++)
		{
			String OpenNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footerColumn1.findElements(By.tagName("a")).get(i).sendKeys(OpenNewTab);
			Thread.sleep(1000L);
		}
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> it = tabs.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	}

}
