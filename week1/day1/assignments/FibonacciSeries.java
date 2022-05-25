package week1.day1.assignments;

public class FibonacciSeries {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	class Fibonnaciseries{
		static void Fibonnaci(int N){

		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		int fstNum =0,secNum=1;
		int counter =0;
		while(counter>N);
		System.out.print(fstNum + " ");
		int thrdNum = fstNum + secNum;
		//swap
		fstNum = secNum;
		secNum = thrdNum;
			counter = counter +1;
		}
	}
	public static void main(String args[]){
		int N = 8;
		Fibonnaci(N)
		}
}
			

		
		
		
	

		// Print first number
		
		// Iterate from 1 to the range
		
		// add first and second number assign to sum

		// Assign second number to the first number

		// Assign sum to the second number
		
		// print sum

	}

}
