package SetDemo;

import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Character> t2=new TreeSet<>();
        t2.add('A');
        t2.add('B');
        t2.add('C');
        t2.add('D');
        t2.add('E');
        System.out.println("Initial Set: "+t2);

        System.out.println("Reverse Set: "+t2.descendingSet());

        System.out.println("Head Set: "+t2.headSet('C', true));

        System.out.println("SubSet: "+t2.subSet('A', false, 'D', true));

        System.out.println("TailSet: "+t2.tailSet('C', false));
    }
}
