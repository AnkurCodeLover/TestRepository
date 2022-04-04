package testJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class InterviewTestNumToDays {

	
	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		LinkedList<String> abc = new LinkedList<String>();
		abc.add("abc");
		
		Map<Integer, String> HashMapobj = new HashMap<Integer,String>();
		HashMapobj.put(1, "BMW");
		HashMapobj.get("Test");
		
		
		String[] daysArray = {"Monday","Tuesday","Wednesday","Thursday","Friday", "Saturday","Sunday"};
		Scanner scanner = new Scanner(System.in);
		int weekday = scanner.nextInt();
		
		if(weekday <=7) {
			System.out.println(daysArray[weekday-1]);
		}
		else {
			System.out.println("Entered day must be betwwen 1-7");
		}
	}
}
