
import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		File Src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(Src, new File("C:\\Users\\divya.arianathan\\Screenshot\\screenshot.png"));
		//FileUtils.copyFile(src, new File("C:\\Users\\divya.arianathan\\Screenshot"));
		//File DestFile=new File(System.getProperty("C:\\Users\\divya.arianathan\\Screenshot")+"\\"+"screenshot.png");
		//FileHandler.copy(Src, DestFile);
		
		

	}

}
