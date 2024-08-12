import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;


public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Relative Locators above, below, Left, Right
		//Step 1 - Import the package import static org.openqa.selenium.support.locators.RelativeLocator.*;
		//Step 2 - Remember only tagname can be used.
		//Step 3 - 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Locator - above
		WebElement nameEditbox = driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditbox)).getText());
		
		//Locator - below
		WebElement dateOfBirth = driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		System.out.println(driver.findElement(with(By.tagName("input")).below(dateOfBirth)).getAttribute("type"));
		
		//Locator - left
		WebElement checkBoxdesc = driver.findElement(By.cssSelector("label[for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(checkBoxdesc)).click();
		
		//Locator - Right
		WebElement studRadio = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(studRadio)).getText());
	}

}
