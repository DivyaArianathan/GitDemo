import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String[] productsNeeded = {"Beetroot", "Beans", "Potato"};
		List<WebElement> productName = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		
		for(int i=0; i<productName.size(); i++)
		{
			String[] product = productName.get(i).getText().split("-");
			String productsplit = product[0].trim();
			List productsList = Arrays.asList(productsNeeded);
			int j=0;
			if(productsList.contains(productsplit))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==productsNeeded.length)
				{
					break;
				}
			
			}
		}
	}

}
