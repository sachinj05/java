package SetDemo;

import java.util.HashSet;

public class HashSetEX2 {
    public static void main(String[] args) {
        HashSet<String> h2 = new HashSet<>();
        h2.add("Eren");
        h2.add("Mikasha");
        h2.add("Levi");
        h2.add("Armin");
        h2.add("Historia");
        h2.add("Annie");
        System.out.println("Initial List:  "+h2);

        h2.remove("Annie");
        System.out.println("After removing List:   "+h2);

        HashSet<String> h3 = new HashSet<>();
        h3.add("Reiner");
        h3.add("Connie");

        h2.addAll(h3);
        System.out.println("After adding List:   "+h2);

        h2.removeAll(h3);
        System.out.println("After removing:   "+h2);

        h2.removeIf(str->str.contains("Eren"));
        System.out.println("after removeif:   "+ h2);

        h2.clear();
        System.out.println("Ater AllClear:   "+h2);
    }
}
