package fracCalc;

import java.util.Scanner;

import org.junit.Test;

// Checkpoint 1-only tests
public class FracCalcTestCheckpoint1
{
    @Test public void testCheckpoint1_1() {  FracCalcTestALL.assertForEarlyCheckpoints("6_5/8", "whole:6 numerator:5 denominator:8", "12_3/8", FracCalc.produceAnswer("5_3/4 + 6_5/8"));}
    @Test public void testCheckpoint1_2() {FracCalcTestALL.assertForEarlyCheckpoints("20", "whole:20 numerator:0 denominator:1", "-20_3/7", FracCalc.produceAnswer("-3/7 - 20"));}
    @Test public void testCheckpoint1_3() {FracCalcTestALL.assertForEarlyCheckpoints("27/21", "whole:0 numerator:27 denominator:21", "-33_2/7", FracCalc.produceAnswer("-32 - 27/21"));}

    public static void main(String[] args){
    	System.out.println("Put in an arithmetic expression."); // Asks the user for an arithmetic expression
    	Scanner input = new Scanner(System.in); //makes scanner to prompt user for arithmetic expression
    	System.out.println(produceAnswer(input)); //prints second operand from produceAnswer
    }
    
    public static String produceAnswer(Scanner input){
    	String calculatorValue = input.nextLine(); //calls scanner and sets input to calculatorValue
    	String[] splitParts = calculatorValue.split(" "); //splits the calculatorValue 2 operands and operator 
    	return splitParts[2]; //returns 2nd operand
   }
}

