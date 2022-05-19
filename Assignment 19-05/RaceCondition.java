
class Task extends Thread{
    private int num=8;

    public void increment(){
        ++num;
    }
    public void decrement(){
        --num;
    }

    public void getname() {
        System.out.println("the number is "+num);

    }

    public void run(){
        synchronized(this){
            System.out.println(Thread.currentThread());
            increment();
            decrement();
            getname();
        }
   }
}
public class RaceCondition {
    public static void main(String[] args) {
        Task t = new Task();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println("*********************");
        t1.start();
        t2.start();
    }
}