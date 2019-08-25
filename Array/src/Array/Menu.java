package Array;
import java.util.*;

public class Menu {
	private List list = new List();
	
///////////////////////////// PRIVATE /////////////////////////////
	
	private Boolean Continue() {
		String str;
		System.out.println("Continue? YES/NO (Y/N)");
		Scanner in = new Scanner(System.in);
		str = in.nextLine();
		
		if (str.equals("n") || str.equals("N") || str.equals("NO") || str.equals("no") || str.equals("No") ) return false;
		else if (str.equals("y") || str.equals("Y") || str.equals("YES") || str.equals("yes") || str.equals("Yes") ) return true;
		else {
			System.out.println("Error!!! Program will continue...");
			return true;
		}
		
}
	
///////////////////////////// PUBLIC /////////////////////////////	
	
	public void menuList() {
		boolean cont = true;
		System.out.println("1. Generate List\n2. Add\n3. Delete\n4. Sort\n5.Show\n6.Save to file\n7.Exit");
		Scanner in = new Scanner(System.in);
		
		while(cont) {
			System.out.print("Input number: ");
			int number = in.nextInt();
			
			switch(number) {
			case(1):
				System.out.print("What is the quantity of elements?: ");
				int size = in.nextInt();
				list.GenerateList(size);
				
				cont = Continue();
				break;
			case(2):
				System.out.print("Input el: ");
				int el = in.nextInt(); 
				list.Add(el);
				
				cont = Continue();
				break;
			case(3):
				if (list.getSize() == 0) {
					System.out.println("list is empty");
				}else {
					System.out.println("element" +  "was deleted");
					list.Delete();
				}
			
				cont = Continue();
				break;
			case(4):
				list.ShowSorted();
			
			    cont = Continue();
				break;
			case(5):
				list.Show();
			
				cont = Continue();
				break;
			case(6):

				list.SaveToFile();
				cont = true; 
				break;
			case(7):
				System.out.println("Exit");
			
				cont = false; 
				break;
			}
		}
		
		System.out.println("Program was finished");
	}
}
