import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String Parent = it.next();
		String Child = it.next();
		driver.switchTo().window(Child);
		String emailid = driver.findElement(By.cssSelector("p.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(Parent);
		driver.findElement(By.id("username")).sendKeys(emailid);
	}

}
