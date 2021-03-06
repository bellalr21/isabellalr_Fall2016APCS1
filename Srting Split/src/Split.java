import java.util.Arrays;
import java.util.Scanner;

public class Split 
{
	public static void main(String[] args){
		System.out.println("Please list ingredients.");
		Scanner userInput = new Scanner(System.in);
		stringSplitOne(userInput.nextLine());
	}
	//Your task:
	/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
	 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
	 * What if it's a fancy sandwich with multiple pieces of bread?
	*/
	
	//Asks user for ingredients
	public static void stringSplitOne(String input) {
		//Splits list of ingredients to get outside and middle of sandwich. Also gets index of "bread". 
			String [] notBread = input.split("bread");
			String [] ingredients = new String[notBread.length -2];
			
			if(notBread.length <= 2){
				System.out.println("Not a sandwich. Input a sandwich.");
			}else{
				if(notBread.length > 2){
					int i = 0;
					while(i < notBread.length -2){
						ingredients[i] = notBread[i + 1];
					}
					System.out.println("This is not a sandwich.");
				}
			}
		}
}
		


		//Your task part 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/
		/*
		public static void StringsplitTwo(String[] args) 
		{
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please list ingredients to describe a sandwich.");
		String userSandwich = userInput.nextLine();
		
		//splits up a sandwich at the spaces " "
		String [] splitSandwich = userSandwich.split(" ");

	}
}
*/

