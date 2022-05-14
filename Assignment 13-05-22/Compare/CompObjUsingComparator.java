package Compare;

import java.util.*;
class Vehicle{
    private String name;
    private int price;
    private int Speed;

    Vehicle(String name, int price, int Speed) {

        this.name = name;
        this.price = price;
        this.Speed = Speed;
    }

    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public int getSpeed(){
        return Speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", Speed=" + Speed +
                '}';
    }
}
class CompDemo implements Comparator<Vehicle>{

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        if(o1.getSpeed()> o2.getSpeed()) {
            return 1;
        }
        else if(o1.getSpeed()< o2.getSpeed()){
            return -1;

        }
        return 0;
    }
}

public class CompObjUsingComparator {
    public static void main(String[] args) {
        List<Vehicle> v = new ArrayList<>();
        v.add(new Vehicle("Sonet",1700000,190));
        v.add(new Vehicle("City",1100000,180));
        v.add(new Vehicle("Grand",800000,170));
        v.add(new Vehicle("Creta",1600000,185));
        v.add(new Vehicle("Figo",750000,165));

        Comparator<Vehicle> com = new CompDemo();
        for(Vehicle o:v) {
            System.out.println(o);
        }
        System.out.println("================================================");

        Collections.sort(v,com);
        for(Vehicle o:v) {
            System.out.println(o);
        }
    }
}
