//4. Write a Java program to update specific array element by given element.

import java.util.ArrayList;

public class Listqna4 {
    public static void main(String[] args) {
        ArrayList<String> a4 = new ArrayList<>();
        a4.add ("Sachin");
        a4.add ("Satya");
        a4.add ("Siva");
        a4.add ("Amit");
        a4.add ("Smruti");
        a4.add ("Sweety");
        System.out.println(a4);

        a4.set(1,"Biswa");
        System.out.println(a4);

        a4.set(5,"Puja");
        System.out.println(a4);

    }
}
