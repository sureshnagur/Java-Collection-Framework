package LIst_Set_Queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//This class is implements the List interface.
public class ArrayListDemo1 {

	public static void main(String[] args) {
		//Group of elements can be stored in a single entity.
		//Insertion order is preserved.
		//Duplicates also allowed to store.
		
		//ArrayList declaration
		ArrayList al=new ArrayList();   //to store heterogeneous data
//		ArrayList<Integer> ob=new ArrayList<Integer>(); //to store homogeneous data
//		List ob1=new ArrayList();  //here ob1 is the reference variable of List interface and object of ArrayList class
		//Add new elements to the ArrayList
			al.add(100);
			al.add("Welsome");
			al.add('B');
			al.add(false);
			//by this add method elements are added at the end of last added elemets
			System.out.println(al);
			//to count number of elements in ArrayList we use size() method.
			System.out.println(al.size());
			
			//to remove value from arraylist we use remove method by specifying either index or value
			al.remove(1);  //or al.remove("Welcome");
			System.out.println(al);
			
			//insert new element into particular position/index.
			al.add(1,"Java");
			System.out.println(al); //[100, Java, B, false]
			
			//retrieve specific element
			System.out.println(al.get(3));  //here 3 is index of element.
											//false
			//replace element
			al.set(1, "Python");
			System.out.println(al);  //[100, Python, B, false]
			
			//search elemets present or not in list this will return either true or false
			System.out.println(al.contains("Python")); //if it exist it returns true else it returns false.
			System.out.println(al.contains("Red"));
			
			//isEmpty()  this method will check whether array is empty or not
			System.out.println(al.isEmpty()); //if its empty it returns true else returns false.
			
			//for loop
			System.out.println("Reading the data using for loop");
			for(int a=0;a<al.size();a++) {
				System.out.println(al.get(a));
			}
			
			//2) for each loop
			System.out.println("Reading the data using for each loop");
			for(Object e:al) {
				System.out.println(e);
			}
			
//			3)iterator
			System.out.println("Reading the data using for iterator");
			
			Iterator it=al.iterator();
			while(it.hasNext()) { //hashNext will check the elements present or not if present it will retuns true
				
				System.out.println(it.next());
				
			}
			
		
	}

}
