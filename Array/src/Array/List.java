package Array;

import java.util.*;


public class List {
	private ArrayList<Integer> list = new ArrayList<Integer>();
	
///////////////////////////// PRIVATE ///////////////////////////// 	

	private ArrayList<Integer> Sort() {
		ArrayList<Integer> tmp = new ArrayList<Integer>(list);
		Collections.sort(tmp);
		return tmp;
	}

///////////////////////////// PUBLIC /////////////////////////////	
	
	public int getSize() { return list.size(); }
	
	public void Add(int el) {
		list.add(el);
	}
	
	public void GenerateList(int size) {
		for (int i=0; i < size; i++) {
			Random r = new Random();
			list.add(r.nextInt());
		}
	}
	
	public void Delete() {
		if (list.size() == 0) return;
		list.remove(list.size()-1);
	}
	
	public void Show() {
		System.out.println("Arraylist contains: " + list.toString());  
	}
	
	public void ShowSorted() {
		System.out.println("Sorted list is " + Sort());
	}
	
}	
