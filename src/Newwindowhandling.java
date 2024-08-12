import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newwindowhandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Open the Practice url and enter the course name - Fetch the first course name from the course url.
		//Step 1 - Go to the main page url to enter course name.
		//Step 2 - Go to the course url and fetch the first available course
		//Step 3 - Enter to the name field under first url.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String ParentWindowId = it.next();
		String ChildWindowId = it.next();
		driver.switchTo().window(ChildWindowId);
		driver.get("https://rahulshettyacademy.com/");
		String CourseName = driver.findElements(By.cssSelector("h2 a[href*='https://courses.rahulshettyacademy.com/']")).get(0).getText();
		System.out.println(CourseName);
		driver.switchTo().window(ParentWindowId);
		WebElement name = driver.findElement(By.xpath("//div/input[@name='name']"));
		name.sendKeys(CourseName);
		
		//Take Screenshot
		File nameShot = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(nameShot, new File("name.png"));
		
		//To get Height and Width of an WebElement
		System.out.println(name.getRect().getHeight());
		System.out.println(name.getRect().getWidth());
		
		
		

	}

}
