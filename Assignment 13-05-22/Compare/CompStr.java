package Compare;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompStr {
    public static void main(String[] arr) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Cpp");
        list.add("JavaScript");
        list.add(".Net");
        list.add("Html");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
