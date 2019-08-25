package Array;
import java.util.*;

public class Menu {
	private List a = new List();
	
	public void menu() {
		boolean finish = false;
		System.out.println("1. Add\n2. Delete\n3. Sort\n4.Show\n5.Exit");
		Scanner in = new Scanner(System.in);
		
		while(!finish) {
			System.out.print("Input number: ");
			int number = in.nextInt();
			
			switch(number) {
			case(1):
				System.out.println("Add");
				break;
			case(2):
				System.out.println("Delete");
				break;
			case(3):
				System.out.println("Sort");
				break;
			case(4):
				System.out.println("Show");
				break;
			case(5):
				System.out.println("Exit");
				finish = true; 
				break;
			}
		}
		
		System.out.println("Program was finished");
	}
}
