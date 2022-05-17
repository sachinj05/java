package MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm1 =new TreeMap<>();
        tm1.put(10,"Tom");
        tm1.put(40,"Jerry");
        tm1.put(30,"Micky");
        tm1.put(20,"Sinchan");

        System.out.println("Iterating TreeMap...");
        for(Map.Entry x : tm1.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
