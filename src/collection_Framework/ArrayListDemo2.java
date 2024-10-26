package collection_Framework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add('X');
		al.add('Y');
		al.add('Z');
		al.add('D');
		al.add('E');
		al.add('F');
		
		ArrayList ob=new ArrayList();
		ob.addAll(al);  //In this we are adding all elements from al arraylist object to ob arraylist.
		System.out.println(ob);  //[A, B, C, D, E, F]
		
		//removeAll() method
		ob.removeAll(al);
		System.out.println("After removing "+ob);
		
		
		//sorting arraylist by using collections class method
		
		System.out.println("Elements in the arraylist "+al);
		Collections.sort(al); //sorting elements in ascending order
		System.out.println("Elemets in the arraylist after sorting "+al);
		Collections.sort(al,Collections.reverseOrder());  //sorting in reverse order
		System.out.println("Elemets in the arraylist after reverse sorting "+al);
		
		//shuffling from collections class
		Collections.shuffle(al);
		System.out.println("Elemets in the arraylist after shuffling "+al);
	}

}
