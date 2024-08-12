import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IntroClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//Launch Firefox
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\divya.arianathan\\Driver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
				
		//Launch Edge
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\divya.arianathan\\Driver\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
				
		driver.get("https://timebank-rt.healthfirstfoundation.org/signin");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		driver.quit();
	}

}
