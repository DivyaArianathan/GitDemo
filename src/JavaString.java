
public class JavaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Karthikeyan Divya Thanya Jannani";
		
		String[] name = s.split(" ");
		System.out.println(name[0]);
		System.out.println(name[2].trim());
		
		for(int i = 0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		//Reverse display
		for(int i = s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}
