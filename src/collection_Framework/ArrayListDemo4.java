package collection_Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		String[] a= {"BMW","Benz","Audi","Swift"};
	
		ArrayList al=new ArrayList(Arrays.asList(a)); 
		
		//or
		List b=Arrays.asList(a);
		
		System.out.println(al);
		System.out.println(b);
		
	}

}
