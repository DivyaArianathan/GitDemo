import java.util.Arrays;
import java.util.List;

public class JavaVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaring Variables and Datatypes
				int Age = 33;
				String Name = "I am Divya";
				char Sex = 'F';
				double height = 5.1;
				boolean Indian = true;
				System.out.println("My Age is "+Age+". "+Name+". My sex is "+Sex+". My Height is "+height+". I am Indian "+Indian);
				
				// Declaring Array Variables
				// Method 1
				
				int[] array1 = new int[5];
				array1[0] = 10;
				array1[1] = 20;
				array1[2] = 30;
				array1[3] = 40;
				array1[4] = 50;
				
				// Method 2
				int[] array2 = {5,10,15,20,25};
				String[] name = {"Divya", "Thanya", "Kathikeyan", "Jannani"};
				
				System.out.println(array1[2]);
				System.out.println(array2[2]);
				
				//Printing array using for loop
				
				for(int i = 0; i<array1.length; i++ )
				{
					System.out.println(array1[i]);
				}
				
				for(int i = 0; i<array2.length; i++ )
				{
					System.out.println(array2[i]);
				}
				
				for(int i = 0; i<name.length; i++ )
				{
					System.out.println(name[i]);
				}
				
				for(int j: array2)
				{
					System.out.println(j);
				}
				
				List<String> nameList = Arrays.asList(name);
				System.out.println(nameList.get(2));
	}

}
