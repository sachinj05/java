package ExceptionExample;

import java.util.Arrays;
import java.util.List;

public class UnsupportedOperationEx {public static void main(String[] args)
{
    String str[] = { "Apple", "Banana" };
    List<String> l = Arrays.asList(str);
    System.out.println(l);

    // It will throw java.lang.UnsupportedOperationException

    l.add("Mango");
}
}
