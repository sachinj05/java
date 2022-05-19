class priority1 extends Thread{
    @Override
    public void run() {
        System.out.println("Priority Given To: "+Thread.currentThread().getName());
    }
}

public class Priority
{
    public static void main(String[] args) {
        priority1 t1 = new priority1();
        priority1 t2 = new priority1();
        priority1 t3 = new priority1();

        t1.start();
        t1.setPriority(10);
        System.out.println(t1);

        t2.start();
        t2.setPriority(8);
        System.out.println(t2);

        t3.start();
        t3.setPriority(3);
        System.out.println(t3);


    }
}
