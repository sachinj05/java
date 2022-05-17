package MapDemo;

import java.util.*;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm1=new HashMap<>();
        hm1.put(123,"Tom");
        hm1.put(755,"Jerry");
        hm1.put(3,"Micky");
        hm1.put(64,"Sinchan");

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : hm1.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
