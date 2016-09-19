
public class DoMath {
	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5)); 
		System.out.println(Calculate.average(5, 10)); 
		System.out.println(Calculate.average(5, 10, 15)); 
		System.out.println(Calculate.toDegrees(100)); 
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(3, 6, 7));
		System.out.println(Calculate.toImproperFrac(3, 4, 7));
		System.out.println(Calculate.toMixedNum(4, 9));
		System.out.println(Calculate.isDivisibleBy(10, 5));
		System.out.println(Calculate.absValue(-10));
		System.out.println(Calculate.max(10, 15));
		System.out.println(Calculate.max(10, 15, 20));
		System.out.println(Calculate.min(10, 15));
		System.out.println(Calculate.round2(24.4475));
		System.out.println(Calculate.exponent(2, 3));
		System.out.println(Calculate.factorial(4));
		System.out.println(Calculate.isPrime(15));
	}
}

/*
System.out.println(Calculate.foil(4, 9, 5, 2, x));
System.out.println(Calculate.absValue(10));
*/