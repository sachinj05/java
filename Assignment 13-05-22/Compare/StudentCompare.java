package Compare;
import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int sid;
    private String eid;
    private String city;

    public Student(String name, int sid, String eid, String city) {
        this.name = name;
        this.sid = sid;
        this.eid = eid;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sid=" + sid +
                ", eid='" + eid + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public int compareTo(Student x) {
        if (this.sid > x.sid) {
            return 1;
        } else if (this.sid < x.sid) {
            return -1;
        }
        return 0;
    }
}

    public class StudentCompare {
        public static void main(String[] args) {
            List<Student> std = new ArrayList<>();
            std.add(new Student("Sachin",23,"sachidanandajena05@gmail.com","Puri"));
            std.add(new Student("Satya",21,"satyabratapradhan99@gmail.com","Bhubaneswar"));
            std.add(new Student("Smruti",25,"smrutiranjan78@gmail.com","Cuttack"));
            std.add(new Student("Siva",22,"rajuebattula007@gmail.com","Andhra"));
            std.add(new Student("Amit",24,"amitprasadpalai45@gmail.com","Cuttack"));

            for(Student x:std) {
                System.out.println(x);
            }
            System.out.println("===================================================================================");
            Collections.sort(std);

            for(Student x:std) {
                System.out.println(x);
            }
        }
    }