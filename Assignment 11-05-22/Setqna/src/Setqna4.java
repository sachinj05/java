//4. Write a Java program to clone a linked list to another linked list.

import java.util.LinkedList;

public class Setqna4 {
    public static void main(String[] args) {
        LinkedList<String>l4 = new LinkedList<>();
        l4.add("Cricket");
        l4.add("Football");
        l4.add("Carom");
        l4.add("Tennis");
        l4.add("Volleyball");
        System.out.println("Original: "+l4);

        LinkedList<String>L4 = new LinkedList<>();
        L4 = (LinkedList)l4.clone();
        System.out.println("Cloned : " + L4);
    }
}
