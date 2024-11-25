package Mastering_java.MultiThreading;

class Thread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("Thread 1 Running *");
            i++;
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("Thread 2 Running ***");
            i++;
        }
    }
}

public class UsingExtend {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();
    }
}
