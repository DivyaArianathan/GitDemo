import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tablefilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check whether the Auto search option yielded right value
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("ang");
		List<WebElement> column = driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> columnNames = column.stream().filter(s->s.getText().contains("ang")).collect(Collectors.toList());
		Assert.assertEquals(column.size(), columnNames.size());

	}

}
