package day1.assignments;

public class PrimeNumber {
	
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {
		
		int prime = 29;
		boolean flag = false;
		for (int i=2;i<=prime/2;i++) 
			if(prime%i==0) {
				flag = true;
				break;
			}
				if (!flag) {
					System.out.println("the number is prime");
				}else
				{
					System.out.println("the number is not prime");
				
		}
		/*int num = prime%2;
		if(num!=0) {
			System.out.println("the given number is prime");
		}
		else {
			System.out.println("the given number is not prime");
			
		}*/
		

		// Declare an int Input and assign a value
		
		// Declare a boolean input as flag

		// Iterate from 1 to half of the input
		
			// Divide the input with each for loop variable and check the remainder
			
				// Set the flag as true when there is no remainder
				
				// break the iterator
				
		// Check the flag (Provide a condition)
		
			// Print 'Prime' when the condition matches
			
			// Print 'Not a Prime' when the condition doesn't match 
			
		

	}

}
