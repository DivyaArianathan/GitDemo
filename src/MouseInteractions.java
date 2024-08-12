import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//input[@class='Pke_EE']"))).click().keyDown(Keys.SHIFT).sendKeys("honey").doubleClick().build().perform();
		a.moveToElement(driver.findElement(By.cssSelector("div[class='H6-NpN _3N4_BX']"))).contextClick().build().perform();
		
	}

}
