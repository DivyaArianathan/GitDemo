import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//To print the count of rows and columns in a table and print the content of secound row.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,640)");
		Thread.sleep(1000);
		int noofRows = driver.findElements(By.cssSelector(".table-display th")).size();
		System.out.println(noofRows);
		int noofColumns = driver.findElements(By.cssSelector(".table-display tr")).size();
		System.out.println(noofColumns);
		List<WebElement> content = driver.findElements(By.cssSelector(".table-display tr:nth-child(3) td"));
		for(int i=0; i<content.size();i++)
		{
		 System.out.println(content.get(i).getText());
		}
		
		

	}

}
