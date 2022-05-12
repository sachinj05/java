/*1.Write a Java program to append the specified element to the end of a linked list and iterate it in reverse order.*/
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Setqna1 {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("Cricket");
        l1.add("Football");
        l1.add("Carom");
        l1.add("Tennis");
        l1.add("Volleyball");
        System.out.println(l1);

        l1.add("Badminton");
        System.out.println(l1);

        Collections.reverse(l1);
        System.out.println(l1);

       /* Iterator p = l1.iterator();
        while (p.hasNext()) {
            System.out.print(p.next()+" ");
        }*/
        }
    }
