
public class Calculate {
	public static int square(int x){
		return (x*x);
	}

	public static int cube(int x){
		return (x*x*x);
	}
	
	public static int average(int x, int y){
		return (x+y)/2;
	}
	
	public static int average(int x, int y, int z){
		return (x+y+z)/3;
	}
	
	public static double toDegrees(double x){
		return (x*(180/3.14159));
	}
	
	public static double toRadians(double x){
		return (x*(3.141519/180));
	}
	
	public static int discriminant(int a, int b, int c){
		return ((b*b) - (4 *a*c));
	}
	
	public static int toImproperFrac(int x, int y, int z){
		return ((x*z+y)/z);
	}
	
	public static String toMixedNum(int x, int y){
		return (x/y) +  "_" + (x%y) + "/" + y;
	}
	
	public static String foil(int a, int b, int c, int d, String variable){
		return ((a*b) + variable+"^2 + " + (a*d + b*c) + variable + (b*d));
	}
	
	public static boolean isDivisibleBy(int x, int y){
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
		x = (int) x;
		x = x/100.0;
		return x;
	}
	
	public static double exponent(double x, int y){
		int value = 1;
		for (int i = 1; i <= y; i++){
			value *= x;
		}
		return value;
	}	
	
	public static int factorial(int x){
		if (x < 0){
			throw new IllegalArgumentException("negative x: " + x);
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
	
}
/*	
	
	public static int sqrt(int x){
		for(int i = 1; (i*i) <= x; i++){
			int closestSquare1 = Calculate.square(i);
			int closestSquare2 = Calculate.square(i+1);
		}
		double subtraction1 = x - closestSquare1;
		double subtraction2 = closestSquare2 - x;
		int result = Calculate.min(subtraction1, subtraction2);
		if(result == subtraction1){
			closestSquare = closestSquare1;
		}else{
			closestSquare = closestSquare2;
		}
		return closestSquare
	}
	
	
	}
*/