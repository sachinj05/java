package SetDemo;
import java.util.*;
public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String> lh1 = new LinkedHashSet<>();
        lh1.add("Eren");
        lh1.add("Mikasha");
        lh1.add("Armin");
        lh1.add("Levi");
        lh1.add("Historia");
        Iterator<String> itr = lh1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }    }
}
