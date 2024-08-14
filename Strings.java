package fundamentals;
/* String Class Java API Methods
 * 		https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
 * str.charAt(k)
 * str.equals(s)
 * str.indexOf(char)
 * str.length()
 * str.toCharArray()
 * str.toLowerCase()
 * str.toUpperCase()
*/

/* Java String Rules!
 * 
 * Must use double quote for strings
 * 	String name = "James";
 * 	System.out.println(name.charAt(0));
 * 
 * Length
 * 0 1 2 3 4
 * J a m e s
 * name.length() -> 5
 * name.charAt(0) -> 'J' single quotes bc it is a char not a string
 * name.charAt(5) -> error because James does not have index 5
 * 
 * Concatenate
 * name = name + "?"; -> James?"
 * name.equals("John") -> returns false because name is not "John", it is "James?"
 * string john = "John";
 * name == john; -> compares memory address and gives error, use name.equals("John");
 */

public class Strings {

	public static void main(String[] args) {
		String word = "Rotator";
		// prints the characters of a string forward and backwards using charAt(k)
		
		for(int i=0; i<word.length(); i++)
			System.out.print(word.charAt(i));
		
		System.out.print(", ");
		
		for(int i=word.length()-1; i>=0; i--)
			System.out.print(word.charAt(i));
	}
}