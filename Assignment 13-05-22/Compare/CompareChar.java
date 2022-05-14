package Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareChar {
    public static void main(String[] arr) {
        List<Character> list = new ArrayList<>();
        list.add('1');
        list.add('4');
        list.add('3');
        list.add('S');
        list.add('D');
        list.add('I');
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}