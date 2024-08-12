import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print only the numbers dvisible by 2

		int[] array1 = { 1, 2, 4, 5, 6, 9, 23, 12, 26 };

		/**
		 * for(int i : array1) { if(i%2 == 0) { System.out.println(i); } else {
		 * System.out.println(i + "is not a multiple of 2"); } }
		 **/

		for (int i = 4; i < array1.length; i--) {
			System.out.println(array1[i]);
		}
	}

}
