import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class WebLocators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String name = "Divya";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
	    driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
	    driver.findElement(By.id("chkboxOne")).click();
	    driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	    Thread.sleep(1000);
	    System.out.println(driver.findElement(By.tagName("p")).getText());
	    Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	    driver.findElement(By.cssSelector("div[class=\"login-container\"] h2")).getText();
	    Assert.assertEquals(driver.findElement(By.cssSelector("div[class=\"login-container\"] h2")).getText(), "Hello "+name+",");
	    driver.findElement(By.xpath("//*[text()='Log Out']")).click();
	    driver.quit();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		String[] PasswordArray = passwordText.split("'");
		String[] PasswordArray1 = PasswordArray[1].split("'");
		String Password = PasswordArray1[0];
		return Password;
	}

}
