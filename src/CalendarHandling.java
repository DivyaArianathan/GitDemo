import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.className("react-date-picker__inputGroup")).click();
		driver.findElement(By.xpath("//div[@class='react-calendar__navigation']/button[3]")).click();
		//String month = "January";
		driver.findElement(By.xpath("//div[@class='react-calendar__year-view__months']/button[5]")).click();
		driver.findElement(By.xpath("//div[@class='react-calendar__month-view__days']/button[10]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']/input[1]")).getAttribute("value"));
		
	}

}
