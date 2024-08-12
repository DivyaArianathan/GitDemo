import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To validate whether the values in a table column is sorted after hitting the Column title.
		
		//Algorithm
		//Click the Column title
		//Fetch the column values as text in a list 
		//Sort the values and get new list
		//compare the results of two list
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("table[class*='table-bordered'] th[aria-label*='Veg']")).click();
		List<WebElement> elementList = driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
		List<String> nameList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sortedList = nameList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(nameList.equals(sortedList));
		List<String> priceval;
		do
		{
			List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
			priceval = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPrice(s)).collect(Collectors.toList());
			priceval.forEach(a->System.out.println(a));
			if(priceval.size()<1)
			{
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		}while(priceval.size()<1);
		
		
		
		
		
		

	}

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}
	

}
