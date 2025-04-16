class  hi implements Runnable {
    public void run(){
        for (int i = 0; i <= 2; i++) {
            System.out.println("HI");
            try{Thread.sleep(1000);}catch (Exception e){}
        }
    }
}
class  hello extends Thread{
    public void run(){
        for (int i = 0; i <= 1; i++) {
            System.out.println("hello");
            try{Thread.sleep(1000);}catch (Exception e){}
        }
    }
}
public class multithreadinginterface {
    public static void main(String[] args) {
        Runnable obj=new hi();
        Runnable obj1=new hello();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        t1.start();
        t2.start();
    }
}
