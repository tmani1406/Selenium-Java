package day1;

import com.google.common.base.CaseFormat;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		String j = "add";
		String k = "Sub";
		String g = "Mul";
		String l = "Div";
		
		switch (j) {
		case "add":
			
			System.out.println("add numbers " + (a+b));
			
			break;
			
		case "Sub":
			
			System.out.println("sub numbers " + (a-b));
			
			break;
			
		case "Mul":
			
			System.out.println("Mul numbers " + (a*b));
			
			break;
			
		case "Div":
		
			System.out.println("Div Numbers " + (a/b));
		
		break;
		

		default:
			
			System.out.println("No numbers");
			break;
		}// Declare 2 integer numbers
		

		// Declare a String variable with input as operations (Tip:
		

		// Initiate switch case for operations
		
		
			// Within switch, include as case for add operation
		
		
			// Within switch, include as case for sub operation
		
		
			// Within switch, include as case for mul operation
		
		
			// Within switch, include as case for div operation
		
		
			// Within switch, include 'default' to handle other operations
		
		
		//end of switch case
		
	}

}
 