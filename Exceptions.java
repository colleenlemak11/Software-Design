package fundamentals;

public class Exceptions {

	// practice throwing exceptions
	private static int fac(int n) throws Exception {
		if(n < 0)
			throw new Exception("Factorial is not defined for negative numbers!");
		else if(n == 0 || n == 1)
			return 1;
		else
			return n * fac(n-1);
	}
	
	
	// use executable program to find factorials given try and catch method
	public static void main(String[] args) {
		int n = 5;
		
		try {
			System.out.println("Factorial(" + n + ") is " + fac(n));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			
			if(n > 4) 
				System.out.println("The input number was greater than 4.");
			else
				System.out.println("The input was less than or equal to 4.");
			
			System.out.println("");
			System.out.print("Thank you for using our factorial program!");
		}
		
		
		System.out.println("");
		
		
		int [] data = { 1, 2, 3, 4, 5 };
		
		System.out.print("Data {");
		
		for(int i=0; i<data.length; i++) 
			System.out.print(data[i]);
		
		System.out.println("}");
		
		// exception handling out of bounds error
		int index = 2;
		
		try {
			System.out.println("Data[" + index + "] is " + data[index]); // if there is an error here, go to execute the catch code -- otherwise, continue
		} catch(Exception e) {
			System.out.println("Index " + index + " is out of bounds.");
		}
		
			

	}

}
