package LIst_Set_Queue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		//COnverting from array to arraylist
		
		String[] a= {"BMW","Benz","Audi","Swift"};
		for(String value:a) {
			System.out.println(value);
		}
		
		ArrayList al=new ArrayList(Arrays.asList(a)); //this way we can convert array into arraylist
		
		System.out.println(al);
	}

}
