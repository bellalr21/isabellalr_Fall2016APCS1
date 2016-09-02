
public class Calculate {
	public static int square(int x){
		return x*x;
	}

	public static int cube(int x){
		return x*x*x;
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
		return absValue(x);
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
	
	public static double round2(double x, double y, double z){
		if (z>=5){
			z = 0;
			y = y+1;
		}
		return x + "." + y + z;
			
		}
	}
}