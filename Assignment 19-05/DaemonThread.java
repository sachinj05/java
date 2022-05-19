class Daemon1 extends Thread{
    public void run(){
        if(currentThread().isDaemon()){
            System.out.println("Demon thread");
        }
        else{
            System.out.println("User thread");
        }
    }
}
public class DaemonThread {
    public static void main(String[] args) {
        Daemon1 t1 = new Daemon1();
        Daemon1 t2 = new Daemon1();
        Daemon1 t3 = new Daemon1();
        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();

    }
}