//3. Write a Java program of swap two elements in a linked list.

import java.util.Collections;
import java.util.LinkedList;

public class Setqna3 {
    public static void main(String[] args) {
        LinkedList<String> l3 = new LinkedList<>();
        l3.add("Cricket");
        l3.add("Football");
        l3.add("Carom");
        l3.add("Tennis");
        l3.add("Volleyball");
        System.out.println("Original: "+l3);

        Collections.swap(l3,1,3);
        System.out.println("Swaped: "+l3);

    }
}
