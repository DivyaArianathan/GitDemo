import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaMethods j = new JavaMethods();
		j.getdata();
		String name = j.getdata();
		System.out.println(name);
		getdata();
		JavaMethods2 j2 = new JavaMethods2();
		j2.getmydata();
		
		

	}
	
	public static String getdata()
	{
		System.out.println("Hi To World");
		return "Good Morning";
	}
	

}
