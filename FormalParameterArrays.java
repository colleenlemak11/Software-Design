package fundamentals;

public class FormalParameterArrays {
	
    public static void print(String str, int [] data) {
        System.out.print(str + " { ");
        
        for (int i=0; i<data.length; i++)
            System.out.print(data[i] + ((i == data.length - 1) ? " " : ", "));
        
        System.out.println("} ");
    }

    public static void zero(int [] data) {
        for (int i=0; i<data.length; i++)
            data[i] = 0;
    }

    public static void duplicate(int [] data) {
    	// <<, >>, are bitwise operators (shift left, shift right)
    	// shift left << adds a zero to the end of a binary string (*2 in binary) 0011 -> 0110
    	// shift right >> adds a zero to the left most bit and take away the right most bit 0110 -> 0011
    	// the number after >> or << is the number of times you multiply or divide by 2
    	
        for (int i=0; i<data.length; i++)
            data[i] = data[i] << 1;  // duplicating means multiplying by 2
    }

    public static void toLowerCase(String[] data) {
    	for(int i=0; i<data.length; i++)
    		data[i] = data[i].toLowerCase();
    }
    
    
    
    
    public static void main(String[] args) {

        int [] numbers = { 1, 2, 4, 8, 16, 32 };
        
        print("Numbers", numbers);
        
        System.out.println("duplicate(numbers)");
        
        duplicate(numbers);
        
        print("Numbers", numbers);

        System.out.println("zero(numbers)");

        zero(numbers);
        
        print("Numbers", numbers);

        
        String [] names = {"Jane", "John", "James", "Anne"};
        
        System.out.print("Names are {");
        
        for(String s: names)
        	System.out.print(s + ",");;

        System.out.println("}");
        
        toLowerCase(names);
        
        System.out.print("Names in lowercase {");
      
        for(String s: names)
        	System.out.print(s + ",");
        
        System.out.println("}");

       
    }

}
