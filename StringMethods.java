package fundamentals;

public class StringMethods {
    /*
     * Java strings are objects the of the String class. A string is an array of characters
     * 
     * Java String class methods
     * 
     *    str.charAt(k)         returns the char value at the specified index k
     *    str.compareTo()       compares two strings lexicographically, returns 0 if the strings are equal, and a value different from 0 when different
     *    str.concat(s)         returns the string str concatenated with string s at the end
     *    str.contains(c)       returns true if the string contains the specified sequence of char values and 0 otherwise
     *    str.equals(s)         returns true is string str and s are equal and false otherwise
     *    str.indexOf(ch)       returns the index of the first occurrence of the specified character ch in the string
     *    str.indexOf(s)        returns the index of the first occurrence of the specified substring s in the string
     *    str.isEmpty()         returns true if the string length is 0 and false otherwise
     *    str.lastIndexOf(ch)   returns the index of the last occurrence of the specified character ch in the string
     *    str.lastIndexOf(s)    returns the index of the last occurrence of the specified substring s in the string
     *    str.length()          returns the length of the string, it returns 0 if the string is empty
     *    str.toCharArray()     returns an array of characters whose length is the length of the string
     *    str.toLowerCase()     returns the string in lower case
     *    str.toUpperCase()     returns the string in upper case
     *    str.trim()            returns a string with leading and trailing whitespaces removed
     *    
     *    https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
     *     
     */

	// characters are 'a' and strings are "apple"
	// definitions of functions below
	
    public static int vowels(String str) {
        // counts the number of vowels of a string using toCharArray()
    	
    	// CHAR ARRAY METHOD
    	int vowelCount = 0;
    	str = str.toLowerCase();
    	char[] arr = str.toCharArray();
 
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
    			vowelCount++;
    	}
    	return vowelCount;
    	
    	/*
    	// CHAR STRING METHOD str.charAt(i)
    	int vowelCount = 0;
    	char ch;
    	str = str.toLowerCase(); // compare only lower case letters
    	
    	for(int i=0; i<str.length(); i++) {
    		ch = str.charAt(i);
    		if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u')
    			vowelCount++;
    	}
    	return vowelCount;
    	*/
     }
 
     public static int consonants(String str) {
        // counts the number of consonants of a string using toCharArray()
    	int consonants = 0;
     	str = str.toLowerCase();
     	char[] arr = str.toCharArray();
  
     	for(int i=0; i<arr.length; i++) {
     		if(arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u')
     			consonants++;
     	}
     	return consonants;
     }
     
     public static boolean hasAllVowels(String str) {
        // returns true if a string has all the vowels and false otherwise
    	 int a = 0;
    	 int e = 0;
    	 int i = 0;
    	 int o = 0;
    	 int u = 0;
    	 str = str.toLowerCase();
    	 char[] letters = str.toCharArray();
    	 
    	 // IF ELSE METHOD
    	 for(int k=0; k<letters.length; k++) {
    		 if(letters[k] == 'a')
    			 a++;
    		 else if(letters[k] == 'e')
    			 e++;
    		 else if(letters[k] == 'i')
    			 i++;
    		 else if(letters[k] == 'o')
    			 o++;
    		 else if(letters[k] == 'u')
    			 u++;  		 
    	 }
    	 
    	 /*
    	 // SWITCH METHOD
    	  for(int k=0; k<letters.length; k++) {
    	  	switch(letters[k]) {
    	 		case 'a': a++;
    	 			break; // use break to make sure the code does not continue running to increment other vowel counts
    	 		case 'e': e++;
    	 			break;
    	 		case 'i': i++;
    	 			break;
    	 		case 'o': o++;
    	 			break;
    	 		case 'u': u++;
    	 	
    	 		default:break;
    	  	}
    	  }
		*/
    	 
    	 if(a > 0 && e > 0 && i > 0 && o > 0 && u >0)
    		 return true;
    	 else
    		 return false;
     }
     
     public static String trim(String str) {
        // returns a new string without whitespaces
    	String trimmed = "";
    	char[] letters = str.toCharArray();
    	
    	for(int i=0; i<letters.length; i++)
    		if(letters[i] != ' ')
    			trimmed = trimmed + letters[i];
    	return trimmed;
     }
     
     public static String reverse(String str) {
        // returns a new string with its characters in reverse order
    	String reversedWord = "";
    	for(int i=str.length()-1; i>=0; i--)
    		reversedWord += str.charAt(i);
    	
    	return reversedWord;
     }

     public static boolean isPalindrome(String str) {
        // returns true if a string is a palindrome and false otherwise
        // use toLowerCase(), trim(String str), reverse(String str), and equals() methods 
    	String forwardStr = trim(str);
    	forwardStr = forwardStr.toLowerCase();
    	
    	String reverseStr = reverse(forwardStr);
    	
    	if(forwardStr.equals(reverseStr))
    		return true; // palindrome (same word forwards and reversed)
    	else
    		return false;
     }
    

    // implements functions defined above
     
	public static void main(String[] args) {
	     // strings are similar to arrays, its characters can be accessed using the [] operator or the charAt(k) method
        // the size of an array is given by its property length, the first character of a string is at position 0 and the last character is at position length-1

        // words having all the vowels: abstemious, ambidextrous, communicative, education, consuetudinary, delusionary, evolutionary, questionary, simultaneous
		
		String words = "hello how are you?";
		System.out.println(trim(words));
		
        String word = "Ambidextrous";
        
        if (hasAllVowels(word))
            System.out.println("'" + word + "' has all the vowels!");
        else
            System.out.println("'" + word + "' doesn't have all the vowels!");
                
        word = "Education";
        
        if (hasAllVowels(word))
            System.out.println("'" + word + "' has all the vowels!");
        else
            System.out.println("'" + word + "' doesn't have all the vowels!");
            
        word = "Algorithm";
        
        if (hasAllVowels(word))
            System.out.println("'" + word + "' has all the vowels!");
        else
            System.out.println("'" + word + "' doesn't have all the vowels!");
        
        // palindromes: mom, dad, repaper, rotator, evitative, race car, top spot, never odd or even, no lemon no melon, step on no pets, sit on a potato pan otis
           
        String sentence = "No lemon no melon";

        if (isPalindrome(sentence))
            System.out.println("'" + sentence + "' is a palindrome!");
        else
            System.out.println("'" + sentence + "' is not a palindrome!");
       
        sentence = "Never odd or even";
       
        if (isPalindrome(sentence))
            System.out.println("'" + sentence + "' is a palindrome!");
        else
            System.out.println("'" + sentence + "' is not a palindrome!");
                     
        sentence = "Never ever";
       
        if (isPalindrome(sentence))
            System.out.println("'" + sentence + "' is a palindrome!");
        else
            System.out.println("'" + sentence + "' is not a palindrome!");

    }
}
