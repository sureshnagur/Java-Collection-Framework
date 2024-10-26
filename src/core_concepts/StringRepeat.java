package core_concepts;

public class StringRepeat {

	
	public static void main(String args[]) {
		String var="Selenium";
		
	int len=var.length();
	String rep="";
	for(int i=len-1;i>=0;i--) {
		
		rep=rep+var.charAt(i);
	}
	System.out.println(rep);
}
}
