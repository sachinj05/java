//3. Write a Java program to retrieve an element (at a specified index) from a given array list

import java.util.ArrayList;

public class Listqna3 {
    public static void main(String[] args) {
        ArrayList<String> a3 = new ArrayList<>();
        a3.add ("Sachin");
        a3.add ("Satya");
        a3.add ("Siva");
        a3.add ("Amit");
        a3.add ("Smruti");
        a3.add ("Sweety");
        System.out.println(a3);

        String element = a3.get(0);
        System.out.println("First element: "+element);

        element = a3.get(2);
        System.out.println("Third element: "+element);

        element = a3.get(3);
        System.out.println("Third element: "+element);
    }
}
