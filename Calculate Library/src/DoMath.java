/*
 * @author APCS1 Isabella Lee-Rubio
 * 10/4/16
 * This class checks the method in the Calculate class to see if they work properly.
 */
public class DoMath {
	public static void main(String[] args) {
		System.out.println(Calculate.square(-1));
		System.out.println(Calculate.cube(-5)); 
		System.out.println(Calculate.average(-5.0, 10.0)); 
		System.out.println(Calculate.average(5.0, -10.0, 15.0)); 
		System.out.println(Calculate.toDegrees(-0.5)); 
		System.out.println(Calculate.toRadians(-60));
		System.out.println(Calculate.discriminant(2.0, 3.0, 4.0));
		System.out.println(Calculate.toImproperFrac(-3, 1, 2));
		System.out.println(Calculate.toMixedNum(-4, 9));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.isDivisibleBy(10, 5));
		System.out.println(Calculate.absValue(-10));
		System.out.println(Calculate.max(10, -15));
		System.out.println(Calculate.max(10.0, 15.0, -20.0));
		System.out.println(Calculate.min(10, 15));
		System.out.println(Calculate.round2(24.34878));
		System.out.println(Calculate.exponent(-1, 3));
		System.out.println(Calculate.factorial(4));
		System.out.println(Calculate.isPrime(11));
		System.out.println(Calculate.gcf(15, 320));
		System.out.println(Calculate.sqrt(49.0));
		System.out.println(Calculate.quadForm(2, 10, 1));
	}
}
