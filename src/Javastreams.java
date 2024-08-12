import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Javastreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<String>();
		name.add("Anitha");
		name.add("Dinesh");
		name.add("Akash");
		name.add("Ajay");
		name.add("Divya");
		int count = 0;
		
		/**for(int i=0; i<name.size();i++)
		{
			String actual = name.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
			
		}
		System.out.println(count);**/
		
		// Using java streams
		Long c = name.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		//declaring list using streams
		long t = Stream.of("Akash", "Dinesh","Divya","Abijit","Aparnathi").filter(s->
		{
			s.startsWith("D");
			return true;
		}).count();
		
		//Fetching all names which start with D
		
		name.stream().filter(s->s.startsWith("D")).forEach(s->System.out.println(s));
		//limit result to some content say 1.
		name.stream().filter(s->s.startsWith("D")).limit(1).forEach(s->System.out.println(s));
		
		
		
		

	}
	
	//@Test
	//Print number which ends with "e" in uppercase
	public void streamMap()
	{
		Stream.of("Karthikeyan", "Divya", "ThanyaShree", "JannaniShree").filter(s->s.endsWith("e")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
	}
	
//	@Test
	
    //Print names which contains "e" and sort in order
	public void sortName()
	{
		ArrayList<String> name = new ArrayList<String>();
		name.add("Anitha");
		name.add("Dinesh");
		name.add("Akash");
		name.add("Ajay");
		name.add("Vijay");
		List<String> names = Arrays.asList("Karthikeyan", "Divya", "Thanyashree", "Jannanishree");
		//names.stream().filter(s->s.contains("e")).sorted().forEach(s->System.out.println(s));
		
		//Concatenate two streams
		
		Stream<String> combinedStream = Stream.concat(name.stream(), names.stream());
		//combinedStream.sorted().forEach(s->System.out.println(s));
		
		//check whether the name "Divya" is available
		boolean flag = combinedStream.anyMatch(s->s.equalsIgnoreCase("Divya"));
		Assert.assertTrue(flag);
		
		
		
	}

	@Test
	public void Collect()
	{
		List<Integer> Li = Arrays.asList(3,2,8,3,4,9,2,1,4);
		//display unique numbers and display the third value.
		List<Integer> sortedList = Li.stream().distinct().sorted().collect(Collectors.toList());
		int i = sortedList.get(3);
		System.out.println(i);
	}
}
