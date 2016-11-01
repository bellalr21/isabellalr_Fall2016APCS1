import java.util.Arrays;
import java.util.Scanner;

public class Split 
{

	public static void main(String[] args) 
	{
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		System.out.println(Arrays.toString("I like apples!".split(" ")));
		System.out.println(Arrays.toString("I really like really red apples".split("really")));
		
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
		
		//Asks user for ingredients
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please list ingredients for a sandwich.");
		String userIngredients = userInput.nextLine();
		
		//Splits list of ingredients to get outside and middle of sandwich. Also gets index of "bread". 
		String [] notBread = userIngredients.split("bread");
		String [] betweenBreads = new String [notBread.length-2];
		int breadIndex = userIngredients.indexOf("bread");
		
		//Gets the inside ingredients if userIngredients is a sandwich
		if (notBread.length > 0){
			for(int i = 0; i < notBread.length - 2; i++){
				betweenBreads[i] = notBread [i+1];
			}
			System.out.print(Arrays.toString(betweenBreads));
		}
		
		//Prints "Not a sandwich if nothing between breads
		if(Arrays.toString(notBread) == "[]"){
			System.out.print("Not a sandwich.");
		}
		
		//conditions for breadbread and breadxbread
		if (ingredients.indexOf("bread") == 0 && (ingredients.lastIndexOf("bread") + 5) == ingredients.length()){
			if (newIngredients.length > 0){
				for (String i : newIngredients){
					System.out.print(i);
				}
			}else{
				System.out.print("Not a sandwich!");
			}
		//conditions for xbreadbread and xbreadxbread
		}else if (ingredients.indexOf("bread") != 0){
			if ((ingredients.lastIndexOf("bread") + 5) == ingredients.length()){
				if (newIngredients.length > 1){
					????????newIngredients = newIngredients.substring(0, "bread");
					for (String i : newIngredients){
						
						System.out.print(i);
					}
				}else{
					System.out.print("Not a sandwich!");
				}
			}
		}
		
		/*
		}else if (ingredients.indexOf("bread") != 0 && (ingredients.lastIndexOf("bread") + 5) != ingredients.length()){
			if (newIngredients.length > 2){
				for (String i : newIngredients){
					System.out.print(i);
				}
			}
		}
		//Your task part 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/

		

	}
}