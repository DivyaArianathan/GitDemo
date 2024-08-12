
import org.testng.annotations.Test;

public class child extends parent {

	
	@Test
	public void getData()
	{
		parent1 p1 = new parent1(3);
		//parent2 p2 = new parent2(3);
		System.out.println(p1.increament());
		System.out.println(p1.decrement());
		//System.out.println(p2.multiply());
		dothis();
	}
	

}
