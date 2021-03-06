/*
 * @author APCS1 Isabella Lee-Rubio
 * 10/4/16
 * This class accepts a string of numbers as user input. It prints the smallest and largest
 * numbers provided by the user. It also prints the sum of all the even numbers given by
 * the user with the largest even number too.
 */
import java.util.*;
public class CollaborativeProgramProcessing {
	public static void main(String args[]){
		/*
		 * Two questions asking the user for how many numbers they want to provide and to pick 
		 * the first number.
		 */
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many numbers?");
		int numTerms = userInput.nextInt();
		System.out.println("Pick a number.");
		int firstNum = userInput.nextInt();
		/*
		 * Storing min, max, and possibly sumOfEvenNums and maxOfEvenNums as the first number
		 * the user provides is useful because through the loop, the computer can determine the 
		 * values of for example, min-if the next number provided by the user is smaller than
		 * the first number, that number gets stored as min instead of the first number.
		 */
		int min = firstNum;
		int max = firstNum;
		int sumOfEvenNums = 0;
		int maxOfEvenNums = 0;
		if (firstNum % 2 == 0){
			sumOfEvenNums += firstNum;
			maxOfEvenNums = firstNum;
		}
		/*
		 * This loop asks for another number from the user each time until i is equal to 
		 * the number of terms the user picked earlier.
		 */
		for (int i = 1; i < numTerms; i++){
			System.out.println("Pick a number.");
			int nextNums = userInput.nextInt();
		/*
		 * If the next number the user provides is greater than the current max, the first 
		 * number, the next number becomes stored as max. Otherwise, if the next number
		 * is less than the current min, again the first number, the next number gets stored
		 * as min.
		 */
			if(nextNums > max){
				max = nextNums;
			}else{
				if(nextNums < min){
					min = nextNums;
				}
			}
		/*
		 * If the number provided in each cycle of the loop is even (denoted by "% 2 == 0", then
		 * the number is added onto the sumOfEvenNumbers. If the number is an even number, and 
		 * is larger than the current even number, it is stored as maxOfEvenNums.
		 */
			if(nextNums % 2 == 0){
				sumOfEvenNums += nextNums;
				if(nextNums > maxOfEvenNums){
					maxOfEvenNums = nextNums;
				}
			}
		}
		/*
		 * Prints out the values on min, max, sumOfEvenNums, and maxOfEvenNums
		 */
		System.out.println("The smallest number is " + min + 
				", the largest number is " + max + ", the sum of the even numbers is " + 
				sumOfEvenNums + ", the largest even number is " + maxOfEvenNums + ".");
	}
}