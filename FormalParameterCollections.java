package fundamentals;

import java.util.ArrayList;
import java.util.List;

public class FormalParameterCollections {

    public static void removeFront(List<String> list) {
        list.remove(0);
    }
    
    public static void print(String str, List<String> list) {
        System.out.print(str + " { ");
        
        for (String s : list) 
            System.out.print(s + " ");

        System.out.println(" } ");
    }
    
    public static void main(String[] args) {
        
        List<String> words = new ArrayList<String>();
        
        words.add("lemon");
        words.add("no");
        words.add("melon");

        print("Words", words);

        removeFront(words);
        
        System.out.println("removeFront(words)");
        
        print("Words", words);    
        
    }

}
