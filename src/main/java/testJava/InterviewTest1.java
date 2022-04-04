package testJava;

public class InterviewTest1 {

	
	public static void main (String[] args) {
		String input="this is a test string";
		//String [] strarray = input.split(" ");
		String reverseStr ="";
		
		if(input.isEmpty() || input==null) {
			System.out.println("String is null");
		}		
		for (int i= input.length()-1;i>=0;i--) {
			reverseStr = reverseStr+input.charAt(i);			
		}
		System.out.println(reverseStr);
	}
}
