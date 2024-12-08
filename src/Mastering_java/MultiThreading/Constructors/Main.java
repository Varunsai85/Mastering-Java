package Mastering_java.MultiThreading.Constructors;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("This is run in MyThr");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThr t1=new MyThr("Varun");
        MyThr t2=new MyThr("Hero");
        t1.start();
        t2.start();
        System.out.println("The id of the Thread 1 is "+t1.getId());
        System.out.println("The id of the Thread 2 is "+t2.getId());
        System.out.println("The Name of the Thread 1 is "+t1.getName());
        System.out.println("The Name of the Thread 2 is "+t2.getName());
    }
}
