package fundamentals;

public class FormalParameterPrimDataTypes {
	// Java formal parameters are passed by value Java doesn;t support pointers so it passes by reference
	
	public static void zero(int value) {
		value = 0;
	}
	
	public static void zero(float value) {
		value = 0.0f;
	}
	
	public static void zero(boolean value) {
		value = false;
	}

	public static void main(String[] args) {
		// formal parameters declaring primitive daa types boolean, char, short, int, long float, and double are passed by value
		
		int x = 2;
		float y = 3.5f;
		boolean answer = true;
		
		System.out.println("int x is " + x);
		System.out.println("float y is " + y);
		System.out.println("boolean answer is " + answer);
		
		zero(x);
		zero(y);
		zero(answer);
		
		System.out.println("int x is " + x);
		System.out.println("float y is " + y);
		System.out.println("boolean answer is " + answer);


	}

}
