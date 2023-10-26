// A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

import java.util.ArrayList;
import java.util.Collections;
public class JavaClass {
    public static void main (String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1; i<=7; i++){
            numbers.add(i);
        }
        System.out.println("Initial List content: " + numbers);
        Collections.shuffle(numbers);
        System.out.println("Suffled List content: " + numbers);


    }
    
}
