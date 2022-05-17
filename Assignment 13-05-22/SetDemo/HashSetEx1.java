package SetDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {
    public static void main(String[] args) {
        HashSet<String> h1 = new HashSet<>();
        h1.add("Eren");
        h1.add("Mikasha");
        h1.add("Armin");
        h1.add("Levi");
        h1.add("Historia");
        Iterator<String> itr = h1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
