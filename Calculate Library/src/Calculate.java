
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
	
	public static int toDegrees(int x){
		return (x*(180/3.14159));
	}
	
	public static int toRadians(int x){
		return (x*(3.141519/180));
	}
	
	public static int discriminant(int x, int y, int z){
		return (b*b - 4ac);
	}
	
	public static int toImproperFrac(int x, int y, int z){
		return ((x*z+y)/z);
	
	public static int toMixedNum(int x, int y){
		return (do the remaind module thing)
	}
	
	public static int foil(int w, int x, int y, int z, String n){
		return ((int w * int y)(n*n) + ((w*z)+(y*z)) + (x*y))
	}
}