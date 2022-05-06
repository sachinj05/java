package ArrayListImplimentation;
import java.util.*;
public class ArraylistEx1 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(); //List Implementation
        l.add("Smruti");  //adding objects to list
        l.add("Sachin");
        l.add("Satya");
        l.add("Siva");
        l.add("Rahim");
        System.out.println("List objects are:  " +l); // printing the list
        l.remove("Rahim"); //removing objects from list
        System.out.println("After Removing Rahim, List Objects are" +l);
    }
}
