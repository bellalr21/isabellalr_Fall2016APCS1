package hourGlass;

public class HourGlass {

public static void main(String[] args) {
	//print line 1
	lineWithQuotes();
	//print the top half
	printTopHalf();
	//print line 6 (middle)
	printMiddleLine();
	//print bottom half
	printLastHalf();
	//print last line (looks just like line 1)
	printLastLine();
	}


public static void lineWithQuotes(){
	System.out.print("|");
	for(int j = 0; j<10; j++){
		System.out.print("\"");
	}
	System.out.println("|");	
	}	

public static void printTopHalf(){
	for (int i=1; i<=4;i++){ //print the first 4 lines
	//Print the spaces
		for (int s=1; s<=i;s++){
			System.out.print(" ");
		}
	//Print the \
	System.out.print("\\");
			// Print the colons
			for (int k= 1; k<=10-2*i;k++){
				System.out.print(":");
			}
	//Print the /
	System.out.println("/");
		}
	}

public static void printMiddleLine(){
	for (int i = 0; i < 5; i++){
			System.out.print(" ");
	}System.out.println("||");
}

public static void printLastHalf(){
	for (int i=4; i>=1;i--){ //print the last 4 lines
	//Print the spaces
		for (int s=1; s<=i;s++){
			System.out.print(" ");
		}
	//Print the \
	System.out.print("/");
			// Print the colons
			for (int k= 1; k<=10-2*i;k++){
				System.out.print(":");
			}
	//Print the /
	System.out.println("\\");
		}
	}

public static void printLastLine(){
	System.out.print("|");
	for(int j = 0; j<10; j++){
		System.out.print("\"");
	}
	System.out.println("|");	
	}	
	
}