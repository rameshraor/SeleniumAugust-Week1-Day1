package week1.day1;

public class AssignmentsFibonacciSeries {

	public static void main(String[] args) {
		
// Code To find Fibonacci Series for a given range
		
		// Declare the input range - For the Fibonacci series to be printed
		int inputRange = 8;
		
		// Declare the other variables & initialize
		int firstNum = 0, secondNum = 1, sum = 0; 
		
		// Perform the FOR loop to print the Fibonacci series - Until the input range is reached
		for(int i=0; sum <= inputRange; i++) {
			

			if (sum == 0) {
				System.out.print(firstNum + " , " + secondNum + " , ");;
			}
			else {
				System.out.print(sum + " , ");
			}
			
			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;

		}
		
		System.out.print(sum);
	}

}
