/**
 * 
 */

/**
 * @author APCS1 Isabella Lee-Rubio
 * 9/1/16
 * This program wwill convert a temperature in Fahrenheit into a Celsius temperature
 */
public class tempConvert {
	public static void main(String[] args) {
		int tempf = 212;
		double tempc;
		tempc = (tempf - 32) * 5/9;
		System.out.println("Body temp in C is: " + tempc);
	}
}
