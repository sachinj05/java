//2. Write a Java program to display the elements and their positions in a linked list.

import java.util.LinkedList;

public class Setqna2 {
    public static void main(String[] args) {
        LinkedList<String>l2 = new LinkedList<>();
        l2.add("Cricket");
        l2.add("Football");
        l2.add("Carom");
        l2.add("Tennis");
        l2.add("Volleyball");
        System.out.println("Original List: "+l2);

        for(int i=0; i<l2.size(); i++){
            System.out.println("List with their position-"+i+":  "+l2.get(i));

        }
    }
}
