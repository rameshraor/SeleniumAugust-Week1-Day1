package week1.day1;

public class AssignmentsPrimeNumber {

	public static void main(String[] args) {
		
		
		// Code To find whether a number is a Prime number or not
		
		// Declare input number
		int inputNum = 13;
		
		// Declare Boolean variable and initialize as False
		boolean isNotPrimeNumber = false;
		int remainder = 0;
		
		// FOR loop to check if the number is divisible by any number other than 1 and itself)
		for(int i=2; i<inputNum; i++) {
			
			//Check if the number is divisible by the iterator (starting from 2 till n-1)
			remainder = inputNum % i;
			
			if(remainder == 0) {
				System.out.println("Number divided by " + i); 
				isNotPrimeNumber = true;
			}
		}
		
		if(isNotPrimeNumber == true) {
			System.out.println("The number " + inputNum + " is NOT a Prime Number");
		}
		else {
			System.out.println("The number " + inputNum + " is a Prime Number");
		}

	}

}
