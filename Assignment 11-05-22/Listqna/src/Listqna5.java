//5. Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;

public class Listqna5 {
    public static void main(String[] args) {
        ArrayList<String> a5 = new ArrayList<>();
        a5.add ("Sachin");
        a5.add ("Satya");
        a5.add ("Siva");
        a5.add ("Amit");
        a5.add ("Smruti");
        a5.add ("Sweety");
        System.out.println(a5);

        a5.add(0,"Virat");
        System.out.println("After adding: "+ a5);
    }
}
