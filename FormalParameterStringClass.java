package fundamentals;

public class FormalParameterStringClass {
    /*
     * Java strings are immutable, once a string is created in memory it cannot be changed. The benefits of having String objects
     * immutable are caching, security, synchronization and performance
     * 
     *  a. Caching. Caching and reusing String literals saves a lot of heap space, since different String variables refer to the
     *     same object in the String pool
     *     
     *  b. Security. Strings are used to store sensitive information. Securing the String class is crucial regarding the security
     *     of Java applications in general
     *    
     *  c. Synchronization. Immutable objects are thread-safe, objects can be shared across multiple threads running concurrently
     *     Java strings are safe for multi-threading
     *   
     *  d. Performance. The JVM String pool enhances the performance by saving heap memory. Improving the String class performance
     *     has a considerable effect on improving the overall efficiency of Java applications
     * 
     */

    public static void swap(String s1, String s2) {
        String t;
        
        t = s1;
        s1 = s2;
        s2 = t;
        
        System.out.println("swap changes the object references, string s1 is '" + s1 + "'!");
        System.out.println("swap changes the object references, string s2 is '" + s2 + "'!");
    }
    
    public static void empty(String s) {
        System.out.println("empty() input string value is '" + s + "'");

        // s gets the value ? but the actual parameter does not change outside of this function
        s = "?";  // a new String with value "?" is created and assigned to s

        System.out.println("the assignment creates a new string with value '" + s + "', that is lost when empty() terminates");
    }

    public static void main(String[] args) {

        // formal parameters declaring a String object are passed as a value
        
        String hello = new String("Hello");
        String world = new String("world");
        
        System.out.println("String hello is '" + hello + "'");
        System.out.println("String world is '" + world + "'");

        System.out.println("swap(hello, world)");
        
        swap(hello, world); // String objects are not swapped! the address (reference) of the strings are passes by value

        System.out.println("String hello is '" + hello + "'");
        System.out.println("String world is '" + world + "'");

        System.out.println("empty(hello)");

        empty(hello);       // the value of the String object is not changed!
        
        System.out.println("String hello is '" + hello + "'");
        System.out.println("String world is '" + world + "'");

    }

}
