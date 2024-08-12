import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HttpsCertification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		/**Launch Firefox
		FirefoxOptions options = new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\divya.arianathan\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(options);**/
						
		/**Launch Edge
		EdgeOptions options = new EdgeOptions();
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.edge.driver", "C:\\Users\\divya.arianathan\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);**/
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
	}

}
