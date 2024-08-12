
import org.testng.annotations.Test;

public class parent1  {
	
	int a;
	

	public parent1(int a) {
		// TODO Auto-generated constructor stub
		this.a=a;
	}

	@Test
	public int increament()
	{
		a=a+1;
		return a;
	}
	
	@Test
	public int decrement()
	{
		a=a-1;
		return a;
	}

}
