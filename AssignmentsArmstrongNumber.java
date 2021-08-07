package week1.day1;

public class AssignmentsArmstrongNumber {

	public static void main(String[] args) {

		// Code To find whether a number is an Armstrong number or not

		// Declare input value
		int inputNumber = 153;

		// Declare other variables
		int remainder, calculated = 0, newNumber;
		newNumber = inputNumber;
		
		// Perform the loop to split the digits, and find the Armstrong number value
		while(newNumber > 0) {
			
			remainder = newNumber % 10;
			newNumber = newNumber / 10;
			
			calculated = calculated + (remainder * remainder * remainder);
			
		}

		// Check if the number is a valid Armstrong number, based on the calculated value, and print the message
		if(calculated == 0) {
			System.out.println("The input number is Zero, and NOT an Armstrong number");
		}
		else if (calculated != inputNumber) {
			System.out.println("The input number " + inputNumber + " is NOT an Armstrong Number");
		}
		else {
			System.out.println("The input number " + inputNumber + " is  an Armstrong Number");
		}
	}

}
