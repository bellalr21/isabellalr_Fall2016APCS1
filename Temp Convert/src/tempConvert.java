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
		int Fahrenheit = 200;
		double Celcius;
		Celcius = (Fahrenheit - 32) * 5/9;
		System.out.println(Fahrenheit + " in Fahrenheit is " + Celcius + " in Celcius.");
	}
}
