package core_concepts;

public class Variables {
	
		int price=10;  // Instance variable
		
		static int discount=15;  //Static variable
		

	public static void main(String[] args) {
		
			int value=20;  //Local variables
			
			Variables ob=new Variables();
			
			System.out.println(value); //calling local variable directly.
			
			System.out.println(Variables.discount); //invoking static variable.
			
			System.out.println(ob.price);  //invoking the instance variables
		
	}

}
