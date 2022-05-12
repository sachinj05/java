//6. Write a Java program to reverse elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class Listqna6 {
    public static void main(String[] args) {
        ArrayList<String> a6 = new ArrayList<>();
        a6.add ("Sachin");
        a6.add ("Satya");
        a6.add ("Siva");
        a6.add ("Amit");
        a6.add ("Smruti");
        a6.add ("Sweety");
        System.out.println(a6);

        Collections.reverse(a6);
        System.out.println(a6);
    }
}
