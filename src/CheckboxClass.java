import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		// driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		// System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		// System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		// To Check the selection of check box using assertion
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());

	}

}
