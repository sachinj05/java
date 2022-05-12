//7. Write a Java program to print all the elements of an ArrayList using the position of the elements.

import java.util.ArrayList;

public class Listqna7 {
    public static void main(String[] args) {
        ArrayList<String> a7 = new ArrayList<>();
        a7.add ("Sachin");
        a7.add ("Satya");
        a7.add ("Siva");
        a7.add ("Amit");
        a7.add ("Smruti");
        a7.add ("Sweety");

        for (int i = 0; i < a7.size(); i++) {
            System.out.print(a7.get(i) + " ");
        }
        // value of i will be changed for every index
    }
}
