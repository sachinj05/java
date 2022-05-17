package SetDemo;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet<String> t1 = new TreeSet<>();
        t1.add("Eren");
        t1.add("Mikasha");
        t1.add("Armin");
        t1.add("Levi");
        t1.add("Historia");
        Iterator<String> itr = t1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
