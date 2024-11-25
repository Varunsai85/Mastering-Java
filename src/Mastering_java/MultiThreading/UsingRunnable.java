package Mastering_java.MultiThreading;

class RunnableThread1 implements Runnable{
    @Override
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("Thread 1 is Running *");
            i++;
        }
    }
}
class RunnableThread2 implements Runnable{
    @Override
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("Thread 2 is Running ***");
            i++;
        }
    }
}

public class UsingRunnable {
    public static void main(String[] args) {
        RunnableThread1 t1=new RunnableThread1();
        Thread host1=new Thread(t1);
        RunnableThread2 t2=new RunnableThread2();
        Thread host2=new Thread(t2);

        host1.start();
        host2.start();
    }
}
