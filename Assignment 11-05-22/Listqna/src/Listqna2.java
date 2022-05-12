//2. Write a Java program to iterate through all elements in an array list.

import java.util.ArrayList;
import java.util.Iterator;

public class Listqna2 {
    public static void main(String[] args) {
        ArrayList<Integer>a2 = new ArrayList<>();
        a2.add(9);
        a2.add(7);
        a2.add(8);
        a2.add(6);
        a2.add(4);
        a2.add(5);
        a2.add(3);
        a2.add(1);
        a2.add(2);
        Iterator itr=a2.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
