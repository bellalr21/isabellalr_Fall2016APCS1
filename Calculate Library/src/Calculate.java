/*
 * @author APCS1 Isabella Lee-Rubio
 * 10/4/16
 * This class implements a variety of basic math methods to complex math methods.
 */
public class Calculate {
	/* 
	 * Part 1 of the class covers methods, headers, and basic math.
	 */
	public static int square(int x){
		return (x*x);
	}

	public static int cube(int x){
		return (x*x*x);
	}
	
	public static double average(double x, double y){
		return (x+y)/2;
	}
	
	public static double average(double x, double y, double z){
		return (x+y+z)/3;
	}
	
	public static double toDegrees(double x){
		return (x*(180/3.14159));
	}
	
	public static double toRadians(double x){
		return (x*(3.141519/180));
	}
	
	public static double discriminant(double a, double b, double c){
		return ((b*b) - (4 *a*c));
	}
	
	public static String toImproperFrac(int x, int y, int z){
		if (x>0){
			return ((x*z+y) + "/" + z);
		}else{
			return (((-1 * x)*z+y) + "/" + z);
		}
	}
	
	public static String toMixedNum(int x, int y){
		return (x/y) +  "_" + (x%y) + "/" + y;
	}
	
	public static String foil(int a, int b, int c, int d, String variable){
		return ((a*c) + variable+"^2 + " + (a*d + b*c) + variable + " " + "+" + " " + (b*d));
	}
	
	/*
	 * Part 2 covers methods with conditionals.
	 */
	public static boolean isDivisibleBy(int x, int y){
		if (x == 0){
			throw new IllegalArgumentException("Cannot divide by zero.");
		}
		return (x % y == 0);
	}
	
	public static double absValue(double x){
		if(x < 0){
			return (x * -1);
		}else{
			return x;
		}
	}
	
	public static int max(int x, int y){
		if (x>y){
			return x;
		}else{
			return y;
		}
	}
	
	public static double max(double x, double y, double z){
		if (x>y && x>z){
			return x;
		}
		if (y>x && y>z){
			return y;
		}else{
			return z;
		}
	}
	
	public static int min(int x, int y){
		if (x<y){
			return x;
		}else{
			return y;
		}
	}
	
	public static double round2(double x){
		x *= 100;
		x += 0.5;
		x = (int) x;
		x = x/100.0;
		return x;
	}
	
	/*
	 * Part 3 covers methods that use loops and calls to other methods.
	 */
	public static double exponent(double x, int y){
		int value = 1;
		if (y < 0){
			throw new IllegalArgumentException("Cannot be a negative number.");
		}
		for (int i = 1; i <= y; i++){
			value *= x;
		}
		return value;
	}
	
	public static int factorial(int x){
		if (x < 0){
			throw new IllegalArgumentException("Cannot be a negative number.");
		}
		int product = 1;
		for (int i = 2; i <= x; i++){
			product = product * i;		
		}
		return product;
	}
	
	public static boolean isPrime(int x){
		for (int i = 2; i < x; i++){
			if(Calculate.isDivisibleBy(x, i)){
				return false;
			}
		}
		return true;
	}
	

	public static int gcf(int x, int y){
		int minNum = Calculate.min(x, y);
		int maxNum = Calculate.max(x, y);
		for(int i = minNum; minNum > 1; i--){
			if(Calculate.isDivisibleBy(maxNum, i) && Calculate.isDivisibleBy(minNum, i)){
				return i;
			}
		} 
		return (1);
	}	
	
	public static double sqrt(double x){
		if (x < 0){
			throw new IllegalArgumentException("Cannot be a negative number.");
		}
		for(double i = 0.1; i <= x; i += 0.1){
			double multiply = i*i;
			if (Calculate.absValue(multiply-x) <= 0.1){
				return Calculate.round2(i);
			} 
		}
		return x;
	}
	
	/*
	 * After implementing exceptions throughout the class, I made a method called quadForm.
	 * Quadform uses the coefficients of a quadratic equation in standard form and uses the 
	 * quadratic formula to determine the real roots. If the discriminant is less than zero, 
	 * the method returns a String that says no real roots. If there is a repeated root,
	 * the method returns the single value rounded to 2 decimal places. If there are two
	 * real roots, the method returns a String that returns the smaller of the two roots first 
	 * and the larger root separated by the word "and".
	 */
	
	public static String quadForm(int a, int b, int c){
	
		double firstRoot;
		double secondRoot;
		double discrim = Calculate.discriminant(a, b, c);
		if(discrim < 0){
			return("no real roots");
		}else if (discrim >= 0){
			double answer1 = Calculate.round2((-b + Math.sqrt(discrim))/(2*a));
			double answer2 = Calculate.round2((-b - Math.sqrt(discrim))/(2*a));
			if(answer1 < answer2){
				firstRoot = answer1;
				secondRoot = answer2;
			}else{
				firstRoot = answer2;
				secondRoot = answer1;
			}
			return (firstRoot + " and " + secondRoot);
		}
		return ("");
		
	}
}