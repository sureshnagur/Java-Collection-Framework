package core;

public class ArrayDemo {

	public static void main(String[] args) {
		// In Java Array we can store multiple values in a single variable. but the
		// limitation is that we can store only homogeneous type data only
		// Arrays are not grow able in nature i.e once we declare the size cannot be
		// increased /decreased.

		// Declaring and Initialize the array

		int[] num = { 3, 45, 65, 67, 34 };

		num[1] = 10;
		for (int i : num) {
			System.out.println(i); // we can print all data in ar
		}

		// or

		for (int a = 0; a < num.length; a++) {
			System.out.println("===============");
			System.out.println(num[a]);
		}
		// Creating the array using new

		int[] age = new int[4]; // here we can store the 4 elements.

		age[0] = 45; // In array index will starts from 0
		age[1] = 20;
		age[2] = 5;
//		age[3]=9;
		age[1] = 10;

		for (int n : age) {
			System.out.println("Checking replace" + n);
		}

	}

}
