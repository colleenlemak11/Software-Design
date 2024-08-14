package fundamentals;

import java.util.Scanner;

public class KeyboardInput {
	
	/*
	 * Keyboard input using system.in and the Scanner class
	 */

	public static void main(String[] args) {
		String name;
		int number;
		
		// system.in is the keyboard input stream, system.out is the console output stream
		
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.println("What's your name?		");
		name = keyboardInput.nextLine();
		
		System.out.println("Your favorite number?	");
		number = keyboardInput.nextInt();
		
		System.out.println("Howdy " + name + ", your favorite number is " + number + "!!");
		
		keyboardInput.close();
	}
}
