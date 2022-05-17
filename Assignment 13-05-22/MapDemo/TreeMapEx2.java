package MapDemo;

import java.util.TreeMap;

public class TreeMapEx2 {
    public static void main(String[] args) {
        TreeMap<Integer,String>tm2 = new TreeMap<>();
        tm2.put(254,"Sachin");
        tm2.put(852,"Tom");
        tm2.put(521,"Jerry");
        tm2.put(151,"Micky");
        tm2.put(999,"Sinchan");
        System.out.println("Main Tree Map: "+tm2);

        System.out.println("Decending Map: "+tm2.descendingMap());

        System.out.println("Head elements: "+tm2.headMap(852,true));

        System.out.println("Tail element: "+tm2.tailMap(254,false));


    }
}
