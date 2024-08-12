import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Karthikeyan");
		a.add("Divya");
		a.add("Thanya Shree");
		a.add("Jannani Shree");
		
		for(int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		
		for(String name: a)
		{
			System.out.println(name);
		}

		System.out.println(a.get(2));
		System.out.println(a.contains("Divya"));
		
	}

}
