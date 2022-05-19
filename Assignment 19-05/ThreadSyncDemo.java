class Order extends Thread{
    int stock=3;
    int orderMade;
    Order(int nom){
        orderMade = nom;           //parameterised constructor
    }
    public synchronized void run(){
        if(orderMade <= stock) {
            System.out.println("Available Stock" + stock);
            System.out.println(orderMade + "order has been made in " +Thread.currentThread().getName());
            try {
                Thread.sleep(500);
                stock--;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("Out Of Stuck");
        }
    }
}


public class ThreadSyncDemo {
    public static void main(String[] args) {
        Order o1 = new Order(1);
        Thread t1 = new Thread(o1, "1st Order");
        Thread t2 = new Thread(o1, "2nd Order");
        Thread t3 = new Thread(o1, "3rd Order");
        Thread t4 = new Thread(o1, "4th Order");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
