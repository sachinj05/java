package Compare;

import java.util.*;

public class CompareInt {
    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();
        l1.add(83);
        l1.add(69);
        l1.add(65);
        l1.add(98);
        l1.add(86);
        l1.add(92);
        System.out.println(l1);

        Collections.sort(l1);
        System.out.println(l1);
    }
}
