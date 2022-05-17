package MapDemo;

import java.util.HashMap;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap <Integer,String> hm2 = new HashMap<>();
        hm2.put(254,"Sachin");
        hm2.put(852,"Tom");
        hm2.put(521,"Jerry");
        hm2.put(151,"Micky");
        hm2.put(999,"Sinchan");
        System.out.println(hm2);

        hm2.remove(23,"Sachin");
        System.out.println(hm2);

        System.out.println(hm2.keySet());

        System.out.println(hm2.values());

        System.out.println(hm2.containsKey(25));

        System.out.println(hm2.containsValue("Siva"));

        System.out.println("Size of the map : "+hm2.size());



    }
}
