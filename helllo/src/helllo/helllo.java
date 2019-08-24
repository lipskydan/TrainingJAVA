package helllo;
import java.util.*;

public class helllo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input size: ");
		int size = in.nextInt(); 
		
		int l=0;
		for(int i = 0, element=1; i < size; i++, element++) {
			if (i%2 == 0)
			{
				l = i;
				for(int j=0; j<l; j++) {
					System.out.print(" ");
				}
				System.out.print(element + "\n");
			}else {
				for(int j=0; j<l; j++) {
					System.out.print(" ");
				}
				System.out.print(element + "\n");
			}
		}	 
	}	
}
	
