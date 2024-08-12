
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class parent {
	
		
	@Test
	public void dothis()
	{
		System.out.println("Logged in successfully");
	}
	
	@BeforeMethod
	public void beforeRun()
	{
		System.out.println("I run first");
	}
	
	@AfterMethod
	public void afterRun()
	{
		System.out.println("I run Last");
	}

}
