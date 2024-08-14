package fundamentals;

/*
 * This program prints:
 * For 1
 * For 3
 * For 5
 * 
 * While 1
 * While 2
 * While 3
 * While 4
 * While 5
 */

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

/* Java String Rules
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

public class CaseSensitive {

	public static void main(String[] args) {

		int If = 5;
		
		for(int For=1; For<=5; For++)
		{
			if(If==5 && For % 2 == 0)
				continue;
			
			System.out.println("For	" + For);
		}
		
		System.out.println("");
		
		int While = 1;
		
		while(While <= 5) 
		{
			System.out.println("While  " + While);
			While++;
		}
	}
}
