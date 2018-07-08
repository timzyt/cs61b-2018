/** Demonstrates creation of a method in Java. */

public class LargerDemo {
	/** return the Lager of x and y. 
		@preconditions */
	public static int larger(int x, int y) {
		if (x>y) {
			return x;

		}
		return y;
	}

	public static void main(String[] args) {
		System.out.println(larger(-5,10));

	}
}

/*
1. Functins must be decalred as part of a class in Java
	A function that is part of a class is called a "method".
2. To define a function in Java, we use "public static".
	We will see alternate ways of defining functions later.
3. All parameters of a function must have a declared type,
	and the return value of the function must have declared type.
	Functions in Java return only one value!
*/ 