package Array;

import java.io.FileWriter;
import java.util.*;




public class List {
	private ArrayList<Integer> list = new ArrayList<Integer>();
	private int indexOfFile = 1;
	
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
	
	public void SaveToFile() {
		 try{
	           FileWriter fw=new FileWriter("test2.txt");    
	           fw.write(list.toString());    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     }    
	}

