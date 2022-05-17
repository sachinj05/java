package Compare;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SmartPhone implements Comparable<SmartPhone> {
    private String name;
    private int price;
    private final String processor;

    SmartPhone(String name, int price, String processor) {
        this.name = name;
        this.price = price;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", processor='" + processor + '\'' +
                '}';
    }

    @Override
    public int compareTo(SmartPhone o) {
        if (this.price>o.price){
            return 1;
        }
        else if (this.price<o.price){
            return -1;
        }
        return 0;
    }
}


public class CompObjUsingComparable {
    public static void main(String[] args) {
        List<SmartPhone> s1 = new ArrayList<>();
        s1.add(new SmartPhone("Redmi NOte 7 Pro",14000,"SD 675"));
        s1.add(new SmartPhone("Realme 5 Pro",15000,"SD 710"));
        s1.add(new SmartPhone("Apple iPhone 13 Pro Max",150000,"Bionic A15"));
        s1.add(new SmartPhone("Samsung Galaxy Z Fold 3",158000,"SD 888"));
        s1.add(new SmartPhone("Xiaomi A3",14300,"SD 675"));

        for(SmartPhone o:s1) {
            System.out.println(o);
        }
        System.out.println("================================================================================");
        Collections.sort(s1);

        for(SmartPhone o:s1) {
            System.out.println(o);
        }
    }
}